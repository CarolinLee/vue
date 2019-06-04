<template>
  <div class="app-container">
    <div class="filter-container">
      <el-form :inline="true" :model="listQuery" class="demo-form-inline">
        <el-row>
          <el-form-item label="政策名称">
            <el-input v-model="listQuery.policyName" placeholder="政策名称" clearable></el-input>
          </el-form-item>
          <el-form-item label="政策代号">
            <el-input v-model="listQuery.policyCode" placeholder="政策代号" clearable></el-input>
          </el-form-item>
          <el-form-item label="行政部门">
            <el-input v-model="listQuery.department" placeholder="行政部门" clearable></el-input>
          </el-form-item>
          <el-form-item label="风险等级">
            <el-input v-model="listQuery.riskLevel" placeholder="风险等级" clearable></el-input>
          </el-form-item>
          <el-form-item label="业务影响">
            <el-input v-model="listQuery.bizEffect" placeholder="业务影响" clearable></el-input>
          </el-form-item>
          <el-form-item>
            <el-button icon="el-icon-search" @click="onSubmit"  circle></el-button>
            <el-button type="success" icon="el-icon-check" @click="refreshFun"  circle></el-button>
          </el-form-item>
          <el-button @click="clearFilter">清除所有过滤器
          </el-button>
        </el-row>
      </el-form>
    </div>
    <el-table ref="table" :data="list" :default-sort = "{prop: 'index', order: 'descending'}" :height="tableHeight" v-loading.body="listLoading"  element-loading-text="拼命加载中" border fit
              highlight-current-row>
      <!--mwz-expanded-start-->
      <!--<el-table-column type="expand">
        <template slot-scope="props">
          <el-form label-position="left" inline class="demo-table-expand">
            <el-form-item label="政策名称">
              <span>{{ props.row.policyName }}</span>
            </el-form-item>
            <el-form-item label="政策代号">
              <span>{{ props.row.policyCode }}</span>
            </el-form-item>
            <el-form-item label="行政部门">
              <span>{{ props.row.department }}</span>
            </el-form-item>
            <el-form-item label="风险等级">
              <span>{{ props.row.riskLevel }}</span>
            </el-form-item>
            <el-form-item label="业务影响">
              <span>{{ props.row.bizEffect }}</span>
            </el-form-item>
            <el-form-item label="来源">
              <span>{{ props.row.source }}</span>
            </el-form-item>
            <el-form-item label="关键词">
              <span>{{ props.row.keyWord }}</span>
            </el-form-item>
          </el-form>
        </template>
      </el-table-column>-->
      <!--mwz-expanded-end-->
      <el-table-column align="center" prop="index" label="序号"  width="80">
        <template slot-scope="scope">
          <span v-text="getIndex(scope.$index)"> </span>
        </template>
      </el-table-column>
      <!--:filters="[{text: '2016-05-01', value: '2016-05-01'}, {text: '2016-05-02', value: '2016-05-02'}, {text: '2016-05-03', value: '2016-05-03'}, {text: '2016-05-04', value: '2016-05-04'}]"-->
      <el-table-column align="center" show-overflow-tooltip label="政策名称" prop="policyName" width="300" ></el-table-column>
      <el-table-column align="center" show-overflow-tooltip label="政策代号" prop="policyCode" width="150"
                       column-key="policyCode"
                       :filters= codelist
                        :filter-method="filterHandler"
      ></el-table-column>
      <el-table-column align="center" show-overflow-tooltip label="行政部门" prop="department" style="width: 60px;"></el-table-column>
      <el-table-column align="center" show-overflow-tooltip label="风险等级" prop="riskLevel" style="width: 60px;"></el-table-column> <!--formatter-->
      <el-table-column align="center" show-overflow-tooltip label="业务影响" prop="bizEffect" style="width: 60px;"></el-table-column>
      <el-table-column align="center" label="状态" prop="status" style="width: 60px;"></el-table-column>
      <el-table-column align="center" show-overflow-tooltip  label="来源" prop="source" width="180"  >
        <template slot-scope="scope">
          <a :href="scope.row.source"   style="color:blue" target="_blank" class="buttonText">{{scope.row.source}}</a>
        </template>
      </el-table-column>
      <el-table-column align="center" show-overflow-tooltip label="关键词" prop="keyWord" width="150"></el-table-column>
      <el-table-column align="center" label="关联亚马逊业务" prop="linkedBiz" style="width: 80px" ></el-table-column>
      <el-table-column align="center" label="关联亚马逊电商业务" prop="linkedEcommerce" style="width: 60px;"></el-table-column>
      <el-table-column align="center" label="业务模式" prop="bizModel" style="width: 60px;"></el-table-column>
      <el-table-column align="center" label="Trade/PC Alert" prop="alert" style="width: 60px;"></el-table-column>
      <el-table-column align="center" label="法律层级" prop="legalLevel" style="width: 60px;"></el-table-column>
      <el-table-column align="center" label="政策类型" prop="policyType" style="width: 60px;"></el-table-column>
      <el-table-column align="center" label="类目Ⅰ" prop="categoryOne" style="width: 60px;"></el-table-column>
      <el-table-column align="center" show-overflow-tooltip label="类目Ⅱ" prop="categoryTwo" style="width: 60px;"></el-table-column>
      <el-table-column align="center" show-overflow-tooltip label="类目Ⅲ" prop="categoryThree" style="width: 60px;"></el-table-column>
      <el-table-column align="center" show-overflow-tooltip label="简介" prop="introduction" style="width: 60px;"></el-table-column>
      <el-table-column align="center" label="发布期" prop="releaseDate" width="100" ></el-table-column>
      <el-table-column align="center" label="生效日期" prop="effectDate" width="100"></el-table-column>
      <el-table-column align="center" label="典型产品" prop="typicalProduct" style="width: 60px;"></el-table-column>
      <el-table-column align="center" label="解读" prop="interpretation" style="width: 60px;"></el-table-column>
      <el-table-column align="center" label="地方政策" prop="localPolicy" style="width: 60px;"></el-table-column>
      <el-table-column align="center" show-overflow-tooltip label="keyPolicy" prop="keyPolicy" style="width: 60px;"></el-table-column>
      <el-table-column align="center" label="质量及检疫风险" prop="qaqr" style="width: 60px;"></el-table-column>
      <el-table-column align="center" label="添加者" prop="addUser" style="width: 60px;"></el-table-column>
      <el-table-column align="center" label="添加时间" prop="addTime" style="width: 60px;"></el-table-column>
      <el-table-column align="center" label="修改者" prop="editUser" style="width: 60px;"></el-table-column>
      <el-table-column align="center" label="修改时间" prop="editTime" style="width: 60px;"></el-table-column>
      <!--<el-table-column align="center" label="角色" width="100">
        <template slot-scope="scope">
          <el-tag type="success" v-text="scope.row.roleName" v-if="scope.row.roleId===1"></el-tag>
          <el-tag type="primary" v-text="scope.row.roleName" v-else></el-tag>
        </template>
      </el-table-column>-->

      <!--<el-table-column align="center" label="管理" width="220" v-if="hasPerm('user:update')">
        <template slot-scope="scope">
          <el-button type="primary" icon="edit" @click="showUpdate(scope.$index)">修改</el-button>
          <el-button type="danger" icon="delete" v-if="scope.row.userId!=userId "
                     @click="removeUser(scope.$index)">删除
          </el-button>
        </template>
      </el-table-column>-->
    </el-table>
    <el-pagination
      @size-change="handleSizeChange"
      @current-change="handleCurrentChange"
      :current-page="listQuery.pageNum"
      :page-size="listQuery.pageRow"
      :total="totalCount"
      :page-sizes="[5, 10, 20, 50, 100]"
      layout="total, sizes, prev, pager, next, jumper">
    </el-pagination>
    <el-dialog :title="textMap[dialogStatus]" :visible.sync="dialogFormVisible">
      <el-form class="small-space" :model="tempUser" label-position="left" label-width="80px"
               style='width: 300px; margin-left:50px;'>
        <el-form-item label="用户名" required v-if="dialogStatus=='create'">
          <el-input type="text" v-model="tempUser.username">
          </el-input>
        </el-form-item>
        <el-form-item label="密码" v-if="dialogStatus=='create'" required>
          <el-input type="password" v-model="tempUser.password">
          </el-input>
        </el-form-item>
        <el-form-item label="新密码" v-else>
          <el-input type="password" v-model="tempUser.password" placeholder="不填则表示不修改">
          </el-input>
        </el-form-item>
        <el-form-item label="角色" required>
          <el-select v-model="tempUser.roleId" placeholder="请选择">
            <el-option
              v-for="item in roles"
              :key="item.roleId"
              :label="item.roleName"
              :value="item.roleId">
            </el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="昵称" required>
          <el-input type="text" v-model="tempUser.nickname">
          </el-input>
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="dialogFormVisible = false">取 消</el-button>
        <el-button v-if="dialogStatus=='create'" type="success" @click="createUser">创 建</el-button>
        <el-button type="primary" v-else @click="updateUser">修 改</el-button>
      </div>
    </el-dialog>
  </div>
</template>
<style>
  .demo-table-expand {
    font-size: 0;
  }
  .demo-table-expand label {
    width: 90px;
    color: #99a9bf;
  }
  .demo-table-expand .el-form-item {
    margin-right: 0;
    margin-bottom: 0;
    width: 50%;
  }
</style>

<script>
  import {mapGetters} from 'vuex'

  export default {
    data() {
      return {
        //设置表单start-mwz
        searchForm: {
          policyName: '',
          region: ''
        },
        //设置表单end-mwz

        //设置table高度自适应start-mwz
        tableHeight: 50,
        tableData: [],
        //设置table高度自适应end-mwz

        totalCount: 0, //分页组件--数据总条数
        list: [],//表格的数据
        policyCodes:[],
        codelist:[],
        //codelisthandle:[],
        codestring: [{text: '2016-05-01', value: '2016-05-01'}, {text: '2016-05-02', value: '2016-05-02'}, {text: '2016-05-03', value: '2016-05-03'}, {text: '2016-05-04', value: '2016-05-04'}],
        listLoading: false,//数据加载等待动画
        listQuery: {
          pageNum: 1,//页码
          pageRow: 20,//每页条数
          policyName: '',
          policyCode:'',
          department:'',
          riskLevel:'',
          bizEffect:'',
          //policyName: this.searchForm,
        },
        roles: [],//角色列表
        dialogStatus: 'create',
        dialogFormVisible: false,
        textMap: {
          update: '编辑',
          create: '新建用户'
        },
        tempUser: {
          username: '',
          password: '',
          nickname: '',
          roleId: '',
          userId: ''
        }
      }
    },

    //设置table高度自适应start-mwz
    mounted(){
      this.$nextTick(function () {
        this.tableHeight = window.innerHeight - this.$refs.table.$el.offsetTop - 55;

        // 监听窗口大小变化
        let self = this;
        window.onresize = function() {
          self.tableHeight = window.innerHeight - self.$refs.table.$el.offsetTop - 55
        }
      })
      //this.$refs.table.$el.offsetTop：表格距离浏览器的高度
      //50表示你想要调整的表格距离底部的高度（你可以自己随意调整），因为我们一般都有放分页组件的，所以需要给它留一个高度　
    },
    //设置table高度自适应end-mwz
    created() {
      this.getList();
      if (this.hasPerm('user:add') || this.hasPerm('user:update')) {
        this.getAllRoles();
      }
    },
    computed: {
      ...mapGetters([
        'userId'
      ])
    },
    methods: {
      //设置form表单start-mwz
      onSubmit() {
        this.api({
          url: "/regulation/search",
          method: "post",
          params:this.listQuery,
        }).then(data => {
          this.listLoading = false;
          this.list = data.list;
          this.totalCount = data.totalCount;
          //this.policyCodes = data.list;
          //解析JSONOBJECT-start-mwz
          var jsonObj = JSON.parse(JSON.stringify(data.list));
          console.log("jsonObj："+typeof (jsonObj));
          var code = [] ;
          var codearray = [] ;
          for (var i = 0; i < jsonObj.length; i++) {
            if (jsonObj[i].policyCode != undefined  ){
              this.policyCodes[i] = jsonObj[i].policyCode;
              code[i] = jsonObj[i].policyCode.trim();
              //console.log(code[i]);
              var precode = {text :code[i],value :code[i]};
              codearray.push(precode);

            }
          }
          this.codelist = [];
          this.codelist = codearray;
        })
      },
      //设置form表单end-mwz
      filterHandler(value, row, column) {
        const property = column['property'];
        return row[property] === value;
      },
      clearFilter() {
        this.$refs.table.clearFilter();
      },
      getAllRoles() {
        this.api({
          url: "/user/getAllRoles",
          method: "get"
        }).then(data => {
          this.roles = data.list;
        })
      },
      refreshFun(){
        this.listQuery.policyName = '';
        this.listQuery.policyCode = '';
        this.listQuery.department = '';
        this.listQuery.riskLevel = '';
        this.listQuery.bizEffect = '';
        this.codelist = [];
        this.getList();
      },
      getList() {
        //查询列表
        this.listLoading = true;
        this.api({
          url: "/regulation/list",
          method: "get",
          params: this.listQuery
        }).then(data => {
          this.listLoading = false;
          this.list = data.list;
          this.totalCount = data.totalCount;
          //解析JSONOBJECT-start-mwz
          var jsonObj = JSON.parse(JSON.stringify(data.list));
          console.log("jsonObj："+typeof (jsonObj));
          var code = [] ;
          var codearray = [] ;
          for (var i = 0; i < jsonObj.length; i++) {
            if (jsonObj[i].policyCode != undefined  ){
              this.policyCodes[i] = jsonObj[i].policyCode;
              code[i] = jsonObj[i].policyCode.trim();
              //console.log(code[i]);
              var precode = {text :code[i],value :code[i]};
              codearray.push(precode);

            }
          }
          this.codelist = [];
          this.codelist = codearray;
        })
      },
      handleSizeChange(val) {
        //改变每页数量
        this.listQuery.pageRow = val
        this.handleFilter();
      },
      handleCurrentChange(val) {
        //改变页码
        this.listQuery.pageNum = val
        this.getList();
      },
      handleFilter() {
        //查询事件
        this.listQuery.pageNum = 1
        this.getList()
      },
      getIndex($index) {
        //表格序号
        return (this.listQuery.pageNum - 1) * this.listQuery.pageRow + $index + 1
      },
      showCreate() {
        //显示新增对话框
        this.tempUser.username = "";
        this.tempUser.password = "";
        this.tempUser.nickname = "";
        this.tempUser.roleId = "";
        this.tempUser.userId = "";
        this.dialogStatus = "create"
        this.dialogFormVisible = true
      },
      showUpdate($index) {
        let user = this.list[$index];
        this.tempUser.username = user.username;
        this.tempUser.nickname = user.nickname;
        this.tempUser.roleId = user.roleId;
        this.tempUser.userId = user.userId;
        this.tempUser.deleteStatus = '1';
        this.tempUser.password = '';
        this.dialogStatus = "update"
        this.dialogFormVisible = true
      },
      createUser() {
        //添加新用户
        this.api({
          url: "/user/addUser",
          method: "post",
          data: this.tempUser
        }).then(() => {
          this.getList();
          this.dialogFormVisible = false
        })
      },
      updateUser() {
        //修改用户信息
        let _vue = this;
        this.api({
          url: "/user/updateUser",
          method: "post",
          data: this.tempUser
        }).then(() => {
          let msg = "修改成功";
          this.dialogFormVisible = false
          if (this.userId === this.tempUser.userId) {
            msg = '修改成功,部分信息重新登录后生效'
          }
          this.$message({
            message: msg,
            type: 'success',
            duration: 1 * 1000,
            onClose: () => {
              _vue.getList();
            }
          })
        })
      },
      removeUser($index) {
        let _vue = this;
        this.$confirm('确定删除此用户?', '提示', {
          confirmButtonText: '确定',
          showCancelButton: false,
          type: 'warning'
        }).then(() => {
          let user = _vue.list[$index];
          user.deleteStatus = '2';
          _vue.api({
            url: "/user/updateUser",
            method: "post",
            data: user
          }).then(() => {
            _vue.getList()
          }).catch(() => {
            _vue.$message.error("删除失败")
          })
        })
      },
    }
  }
</script>

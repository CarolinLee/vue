package com.heeexy.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


/**
 * @author: hxy
 * @description: SpringBoot启动类
 * @date: 2017/10/24 11:55
 */
@SpringBootApplication
@MapperScan("com.heeexy.example.dao")
//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class MyApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		System.out.print("      " +
				"" +
				"" +
				"         		               _ooOoo_\n" +
				"\t *                            o8888888o\n" +
				"\t *                            88\" . \"88\n" +
				"\t *                            (| -_- |)\n" +
				"\t *                            O\\  =  /O\n" +
				"\t *                         ____/`---'\\____\n" +
				"\t *                       .'  \\\\|     |//  `.\n" +
				"\t *                      /  \\\\|||  :  |||//  \\\n" +
				"\t *                     /  _||||| -:- |||||-  \\\n" +
				"\t *                     |   | \\\\\\  -  /// |   |\n" +
				"\t *                     | \\_|  ''\\---/''  |   |\n" +
				"\t *                     \\  .-\\__  `-`  ___/-. /\n" +
				"\t *                   ___`. .'  /--.--\\  `. . __\n" +
				"\t *                .\"\" '<  `.___\\_<|>_/___.'  >'\"\".\n" +
				"\t *               | | :  `- \\`.;`\\ _ /`;.`/ - ` : | |\n" +
				"\t *               \\  \\ `-.   \\_ __\\ /__ _/   .-` /  /\n" +
				"\t *          ======`-.____`-.___\\_____/___.-`____.-'======\n" +
				"\t *                             `=---='\n" +
				"\t *          ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n" +
				"\t *                     佛祖保佑        永无BUG\n" +
				"\t *            佛曰:\n" +
				"\t *                   写字楼里写字间，写字间里程序员；\n" +
				"\t *                   程序人员写程序，又拿程序换酒钱。\n" +
				"\t *                   酒醒只在网上坐，酒醉还来网下眠；\n" +
				"\t *                   酒醉酒醒日复日，网上网下年复年。\n" +
				"\t *                   但愿老死电脑间，不愿鞠躬老板前；\n" +
				"\t *                   奔驰宝马贵者趣，公交自行程序员。\n" +
				"\t *                   别人笑我忒疯癫，我笑自己命太贱；\n" +
				"\t *                   不见满街漂亮妹，哪个归得程序员？\n");

		SpringApplication application = new SpringApplication(MyApplication.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// 注意这里要指向原先用main方法执行的Application启动类
		return builder.sources(MyApplication.class);
	}
	/*
	 *                             _ooOoo_
	 *                            o8888888o
	 *                            88" . "88
	 *                            (| -_- |)
	 *                            O\  =  /O
	 *                         ____/`---'\____
	 *                       .'  \\|     |//  `.
	 *                      /  \\|||  :  |||//  \
	 *                     /  _||||| -:- |||||-  \
	 *                     |   | \\\  -  /// |   |
	 *                     | \_|  ''\---/''  |   |
	 *                     \  .-\__  `-`  ___/-. /
	 *                   ___`. .'  /--.--\  `. . __
	 *                ."" '<  `.___\_<|>_/___.'  >'"".
	 *               | | :  `- \`.;`\ _ /`;.`/ - ` : | |
	 *               \  \ `-.   \_ __\ /__ _/   .-` /  /
	 *          ======`-.____`-.___\_____/___.-`____.-'======
	 *                             `=---='
	 *          ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	 *                     佛祖保佑        永无BUG
	 *            佛曰:
	 *                   写字楼里写字间，写字间里程序员；
	 *                   程序人员写程序，又拿程序换酒钱。
	 *                   酒醒只在网上坐，酒醉还来网下眠；
	 *                   酒醉酒醒日复日，网上网下年复年。
	 *                   但愿老死电脑间，不愿鞠躬老板前；
	 *                   奔驰宝马贵者趣，公交自行程序员。
	 *                   别人笑我忒疯癫，我笑自己命太贱；
	 *                   不见满街漂亮妹，哪个归得程序员？
	 */
}

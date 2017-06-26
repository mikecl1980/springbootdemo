package mikecl.example.configure;



import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ITemplateResolver;

@Configuration
@EnableWebMvc
@ComponentScan("mikecl.example")
@MapperScan("mikecl.example.mapper")
public class WebConfig extends WebMvcConfigurerAdapter 
{	
	
	


	@Bean 	
	
	public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource)

	{  
	    SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();  	   
	    sqlSessionFactoryBean.setDataSource(dataSource);
	    sqlSessionFactoryBean.setConfigLocation(new ClassPathResource("/mapper/MyBatisConfig.xml"));  
	    return sqlSessionFactoryBean;  
	} 
	
		
}

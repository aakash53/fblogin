/*package social;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import config.SocialConfig;
import config.WebConfig;
import javax.servlet.Filter;
import org.springframework.web.filter.DelegatingFilterProxy;
public class SocialWebApplicationInitializer extends
AbstractAnnotationConfigDispatcherServletInitializer {
@Override
protected Class<?>[] getRootConfigClasses() {
return new Class<?>[]{SocialConfig.class};
}
@Override
protected Class<?>[] getServletConfigClasses() {
return new Class<?>[] {WebConfig.class, };
}
@Override
protected String[] getServletMappings() {
return new String[] {"/"};
}
}*/
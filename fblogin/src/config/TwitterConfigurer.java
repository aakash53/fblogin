package config;
import org.springframework.social.config.annotation.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
/*import org.springframework.core.env.Environment;
import org.springframework.social.config.annotation.ConnectionFactoryConfigurer;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.social.twitter.connect.TwitterConnectionFactory;

@Configuration
public  class TwitterConfigurer extends SocialConfigurerAdapter {
@Override
public void addConnectionFactories(
ConnectionFactoryConfigurer connectionFactoryConfigurer,
Environment env) {
connectionFactoryConfigurer.addConnectionFactory(
new TwitterConnectionFactory(
env.getRequiredProperty("twitter.appId"),
env.getRequiredProperty("twitter.appSecret")));
}
@Bean
@Scope(value = "request", proxyMode = ScopedProxyMode.INTERFACES)
public Twitter twitterTemplate(ConnectionRepository connectionRepository) {
Connection<Twitter> connection = connectionRepository.findPrimaryConnection(Twitter.class);
return connection != null ? connection.getApi() : null;
}
}*/
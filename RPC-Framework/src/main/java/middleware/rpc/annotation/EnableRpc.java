package middleware.rpc.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Annotation for starting this RPC middleware
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Import({ServerAutoConfiguration.class})
@EnableCOnfigurationProperties(ServerProperties.class)
@ComponentScan("middleware.*")
public @interface EnableRpc {
}

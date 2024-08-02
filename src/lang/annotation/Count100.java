package lang.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Count100 {
}

// Count100 어노테이션을 JVM이 실행시에 감지할 수 있도록 하려면, @Retention(RetentionPolicy.RUNTIME)를 붙여줘야 한다.
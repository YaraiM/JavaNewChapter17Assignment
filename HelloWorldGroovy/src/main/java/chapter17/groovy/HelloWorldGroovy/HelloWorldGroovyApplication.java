package chapter17.groovy.HelloWorldGroovy;

import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldGroovyApplication {

  public static void main(String[] args) {
    SpringApplication.run(HelloWorldGroovyApplication.class, args);
  }

  @GetMapping("/hello")
  public String hello() {
    return "Hello, World!";
  }

  @GetMapping("/numeric")
  // StringUtilsを試しに使用する。
  public String showBoolean() {
    String result1 = String.valueOf(StringUtils.isNumeric("sushi"));
    String result2 = String.valueOf(StringUtils.isNumeric("すし"));
    String result3 = String.valueOf(StringUtils.isNumeric("123"));
    String result = "数字かどうか判定します。「sushi」は" + result1 + ", 「すし」は" + result2 + ", 「123」は" + result3 +"です。";
    return result;
  }
}

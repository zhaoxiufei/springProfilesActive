package com.github.zhaoxiufei;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author <a href="mailto:zhaoxiufei@gmail.com">赵秀非</a>
 * @since 2019/12/25 下午8:23
 */
@SpringBootApplication
public class SpringProfilesActiveApplication implements CommandLineRunner {


  public static void main(String[] args) {
    SpringApplication.run(SpringProfilesActiveApplication.class, args);
  }

  @Value("${my.name}")
  private String myName;
  @Value("${test.key}")
  private String testKey;

  @Override
  public void run(String... args) throws Exception {
    System.out.println("My name is " + myName);
    System.out.println("Environment is " + testKey);
  }
}

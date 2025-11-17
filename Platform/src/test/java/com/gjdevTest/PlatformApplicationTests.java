package com.gjdevTest;


import com.gjdev.platform.PlatformApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest(classes = PlatformApplication.class)
@Transactional
class PlatformApplicationTests {

}

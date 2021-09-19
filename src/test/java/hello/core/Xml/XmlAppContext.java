package hello.core.Xml;

import hello.core.member.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import static org.assertj.core.api.Assertions.*;

public class XmlAppContext {
    @Test
    void xmlAppContext() {
        ApplicationContext ac = new
                GenericXmlApplicationContext("appConfig.xml");//리소스안에 등록해줌

        MemberService memberService = ac.getBean("memberService",
                MemberService.class);
        assertThat(memberService).isInstanceOf(MemberService.class);
    }
}
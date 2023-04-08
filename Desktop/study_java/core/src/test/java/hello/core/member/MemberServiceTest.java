package hello.core.member;

import hello.core.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MemberServiceTest {
//    MemberService memberService = (MemberService) new MemberServiceImpl();
    MemberService memberService;
    @BeforeEach // Test 실행전 먼저 실행
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }
    @Test
    void join() {
//given
        Member member = new Member(1L, "memberA", Grade.VIP);
//when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);
//then
        Assertions.assertThat(member).isEqualTo(findMember);
    }

}
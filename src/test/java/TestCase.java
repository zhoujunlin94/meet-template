import io.github.zhoujunlin94.meet.Application;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author zhoujunlin
 * @date 2025/5/29 21:41
 */
@Slf4j
@RunWith(SpringRunner.class)
// @ActiveProfiles(profiles = "dev")
@SpringBootTest(classes = Application.class)
public class TestCase {

    @Test
    public void test1() {
        log.warn("start test");
        log.warn("end test");
    }


}

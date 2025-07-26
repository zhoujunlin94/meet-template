import io.github.zhoujunlin94.meet.Application;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author zhoujunlin
 * @date 2025/5/29 21:41
 */
@Slf4j
// @ActiveProfiles(profiles = "dev")
@SpringBootTest(classes = Application.class)
public class TestCase {

    @Test
    public void test1() {
        log.warn("start test");
        log.warn("end test");
    }


}

import org.junit.Test;

// import static org.hamcrest.CoreMatchers.containsString;
// import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
// import static org.junit.Assert.fail;

/**
 * @author alex.collins
 */
public class GameFactoryTest {

    @Test
    public void testBuild() throws Exception {
        new GameFactory().createGame(getClass().getResourceAsStream("/example.field"));

    }

    @Test
    public void sampleTest() {
        assertThat(1, is(1));
    }
}

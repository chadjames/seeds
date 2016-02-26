/**
 * Created by chad on 2/25/2016.
 */
class HelloTest extends GroovyTestCase {
    void testHello() {
        Hello hello = new Hello()
        assert 'hello' == hello.hello()
    }
}


class HelloTest extends GroovyTestCase {
    void testHello() {
        Hello hello = new Hello()
        assert 'hello' == hello.hello()
    }
}

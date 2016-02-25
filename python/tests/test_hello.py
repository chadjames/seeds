from unittest import TestCase

from src.hello import Hello


class TestHello(TestCase):
    def test_default_greeting_set(self):
        greeter = Hello()
        self.assertEqual(greeter.message, 'Hello1')

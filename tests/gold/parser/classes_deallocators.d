class Foo { int x; this() { x = 1; } }
Foo foo = new Foo;
destroy(foo);
assert(foo.x == int.init);  // object is still accessible

delete(void *p)
{
}


/*
UnusedLocalVariable
allowUnnamedVariables = (default)true
jdkVersion = (default)22

*/

// non-compiled with javac: Compilable with Java25

int topLevelField = 99;

void m() {
    int unused = 1; // violation 'Unused named local variable 'unused''
    int used = 2;
    System.out.println(used);
}

Runnable r = new Runnable() {
    public void run() {}
};

void main() { }

class Super {
    int a;
}

class SuperNoField {
}

void testShadowing() {
    int a = 1; // violation 'Unused named local variable 'a''
    new Super() {
        void test() {
            System.out.println(a);
        }
    };
}

void testNoShadowing() {
    int b = 1;
    new SuperNoField() {
        void test() {
            System.out.println(b);
        }
    };
}

void testClean() {
    int cleanVar = 42;
    System.out.println(cleanVar);
}

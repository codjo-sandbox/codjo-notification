package net.codjo.notification.server;
import net.codjo.test.common.depend.Dependency;
import net.codjo.test.common.depend.PackageDependencyTestCase;
/**
 *
 */
public class DependencyTest extends PackageDependencyTestCase {
    private static final boolean JAVA_8 = System.getProperty("java.version").startsWith("1.8.");

    public void test_dependency() throws Exception {
        Dependency dependency = createDependency();
        dependency.assertDependency(JAVA_8 ? "dependency-jdk8.txt" : "dependency.txt");
        dependency.assertNoCycle();
    }


    public void test_dependencyTest() throws Exception {
        Dependency dependency = createTestDependency();
        dependency.assertDependency(JAVA_8 ? "dependencyTest-jdk8.txt" : "dependencyTest.txt");
        dependency.assertNoCycle();
    }
}
//package com.smbtec.xo.mongodb.test.migration;
//
//import static org.hamcrest.Matchers.equalTo;
//import static org.junit.Assert.assertThat;
//
//import java.net.URISyntaxException;
//import java.util.Collection;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.junit.runners.Parameterized;
//
//import com.buschmais.xo.api.XOManager;
//import com.buschmais.xo.api.bootstrap.XOUnit;
//import com.smbtec.xo.mongodb.test.AbstractMongoDbXOManagerTest;
//import com.smbtec.xo.mongodb.test.migration.composite.A;
//import com.smbtec.xo.mongodb.test.migration.composite.B;
//import com.smbtec.xo.mongodb.test.migration.composite.C;
//import com.smbtec.xo.mongodb.test.migration.composite.D;
//
//@RunWith(Parameterized.class)
//public class MigrationTest extends AbstractMongoDbXOManagerTest {
//
//    public MigrationTest(XOUnit xoUnit) {
//        super(xoUnit);
//    }
//
//    @Parameterized.Parameters
//    public static Collection<Object[]> getXOUnits() throws URISyntaxException {
//        return xoUnits(A.class, B.class, C.class, D.class);
//    }
//
//    @Test
//    public void downCast() {
//        XOManager xoManager = getXoManagerFactory().createXOManager();
//        A a = xoManager.create(A.class);
//        a.setValue("Value");
//        B b = xoManager.migrate(a, B.class);
//        assertThat(a == b, equalTo(false));
//        assertThat(b.getValue(), equalTo("Value"));
//        xoManager.close();
//    }
//
//    @Test
//    public void compositeObject() {
//        XOManager xoManager = getXoManagerFactory().createXOManager();
//        A a = xoManager.create(A.class);
//        a.setValue("Value");
//        B b = xoManager.migrate(a, B.class, D.class).as(B.class);
//        assertThat(b.getValue(), equalTo("Value"));
//        xoManager.close();
//    }
//
//    @Test
//    public void migrationHandler() {
//        XOManager xoManager = getXoManagerFactory().createXOManager();
//        A a = xoManager.create(A.class);
//        a.setValue("Value");
//        XOManager.MigrationStrategy<A, C> migrationStrategy = new XOManager.MigrationStrategy<A, C>() {
//            @Override
//            public void migrate(A instance, C target) {
//                target.setName(instance.getValue());
//            }
//        };
//        C c = xoManager.migrate(a, migrationStrategy, C.class);
//        assertThat(c.getName(), equalTo("Value"));
//        xoManager.close();
//    }
//
//    @Test
//    public void compositeObjectMigrationHandler() {
//        XOManager xoManager = getXoManagerFactory().createXOManager();
//        A a = xoManager.create(A.class);
//        a.setValue("Value");
//        XOManager.MigrationStrategy<A, C> migrationStrategy = new XOManager.MigrationStrategy<A, C>() {
//            @Override
//            public void migrate(A instance, C target) {
//                target.setName(instance.getValue());
//            }
//        };
//        C c = xoManager.migrate(a, migrationStrategy, C.class, D.class).as(C.class);
//        assertThat(c.getName(), equalTo("Value"));
//        xoManager.close();
//    }
//}

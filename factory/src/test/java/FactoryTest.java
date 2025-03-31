import factory.DeviceFactory;
import model.Phone;
import model.Tablet;
import model.android.AndroidPhone;
import model.android.AndroidTablet;
import model.os.OsPhone;
import model.os.OsTablet;
import model.windows.WindowsPhone;
import model.windows.WindowsTablet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactoryTest {

  @Test
  void testWindowsFactory() {

    FactoryManager manager = FactoryManager.getInstance();

    DeviceFactory<?> factory = manager.getFactory(SystemType.WINDOWS);

    Phone<?> phone = factory.createPhone();
    Assertions.assertInstanceOf(WindowsPhone.class, phone);

    Tablet<?> tablet = factory.createTablet();
    Assertions.assertInstanceOf(WindowsTablet.class, tablet);
  }

  @Test
  void testOsFactory() {

    FactoryManager manager = FactoryManager.getInstance();

    DeviceFactory<?> factory = manager.getFactory(SystemType.OS);

    Phone<?> phone = factory.createPhone();
    Assertions.assertInstanceOf(OsPhone.class, phone);

    Tablet<?> tablet = factory.createTablet();
    Assertions.assertInstanceOf(OsTablet.class, tablet);
  }

  @Test
  void testAndroidFactory() {

    FactoryManager manager = FactoryManager.getInstance();

    DeviceFactory<?> factory = manager.getFactory(SystemType.ANDROID);

    Phone<?> phone = factory.createPhone();
    Assertions.assertInstanceOf(AndroidPhone.class, phone);

    Tablet<?> tablet = factory.createTablet();
    Assertions.assertInstanceOf(AndroidTablet.class, tablet);
  }
}

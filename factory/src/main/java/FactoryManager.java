import factory.AndroidFactory;
import factory.DeviceFactory;
import factory.OsFactory;
import factory.WindowsFactory;

public class FactoryManager {

  private static FactoryManager instance;

  public static FactoryManager getInstance() {
    if (instance == null) {
      instance = new FactoryManager();
    }
    return instance;
  }

  public DeviceFactory getFactory(SystemType type) {

    switch (type) {
      case ANDROID:
        return new AndroidFactory();
      case WINDOWS:
        return new WindowsFactory();
      case OS:
        return new OsFactory();
      default:
        throw new IllegalArgumentException("Unknown system type: " + type);
    }
  }
}

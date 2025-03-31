import factory.AndroidFactory;
import factory.DeviceFactory;
import factory.OsFactory;
import factory.WindowsFactory;
import model.system.System;

public class FactoryManager {

  private static FactoryManager instance;

  public static FactoryManager getInstance() {
    if (instance == null) {
      instance = new FactoryManager();
    }
    return instance;
  }

  public DeviceFactory<? extends System> getFactory(SystemType type) {

    return switch (type) {
      case ANDROID -> new AndroidFactory();
      case WINDOWS -> new WindowsFactory();
      case OS -> new OsFactory();
    };
  }
}

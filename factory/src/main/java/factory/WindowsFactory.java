package factory;

import model.Phone;
import model.Tablet;
import model.windows.WindowsPhone;
import model.windows.WindowsTablet;

public class WindowsFactory implements DeviceFactory {

  public Phone createPhone() {
    return new WindowsPhone();
  }

  public Tablet createTablet() {
    return new WindowsTablet();
  }
}

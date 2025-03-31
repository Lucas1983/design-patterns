package factory;

import model.Phone;
import model.Tablet;
import model.system.Windows;
import model.windows.WindowsPhone;
import model.windows.WindowsTablet;

public class WindowsFactory implements DeviceFactory<Windows> {

  public Phone<Windows> createPhone() {
    return new WindowsPhone();
  }

  public Tablet<Windows> createTablet() {
    return new WindowsTablet();
  }
}

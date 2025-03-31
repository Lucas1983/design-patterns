package factory;

import model.Phone;
import model.Tablet;
import model.system.System;

public interface DeviceFactory<S extends System> {

  Phone<S> createPhone();

  Tablet<S> createTablet();
}

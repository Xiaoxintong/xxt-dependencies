package cn.xxt.jxq.test.common.injection.component;

import javax.inject.Singleton;

import dagger.Component;
import cn.xxt.jxq.injection.component.ApplicationComponent;
import cn.xxt.jxq.test.common.injection.module.ApplicationTestModule;

@Singleton
@Component(modules = ApplicationTestModule.class)
public interface TestComponent extends ApplicationComponent {

}

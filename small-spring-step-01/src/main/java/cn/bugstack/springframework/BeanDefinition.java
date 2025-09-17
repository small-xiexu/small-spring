package cn.bugstack.springframework;

/**
 * 用于定义 Bean 实例化信息
 * @author sxie
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }

}

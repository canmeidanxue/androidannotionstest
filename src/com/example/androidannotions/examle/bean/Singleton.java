package com.example.androidannotions.examle.bean;

import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.EBean.Scope;
/**
 * 单例类需要如下声明
 * 注意：在单例类里面不可以注入view和事件绑定，
 * 因为单例的生命周期比Activity和Service的要长，
 * 以免发生内存溢出。
 * @author hong
 *
 */
@EBean(scope = Scope.Singleton)
public class Singleton {

}

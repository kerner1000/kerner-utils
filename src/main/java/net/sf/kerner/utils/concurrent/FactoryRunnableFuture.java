package net.sf.kerner.utils.concurrent;

import java.util.concurrent.RunnableFuture;

public interface FactoryRunnableFuture<T> {

    RunnableFuture<T> create(Runnable runnable, T value);

}

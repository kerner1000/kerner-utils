package net.sf.kerner.utils;

import net.sf.kerner.utils.transformer.Transformer;

/**
 * 
 * In contrast to a {{@link Transformer}, a {@code Decorator} returns another
 * view of the same object instead of creating a new one. </p> In other words,
 * {@code I == O} should always return {@code true}.
 * 
 * <p>
 * <b>Example:</b><br>
 * 
 * </p>
 * <p>
 * 
 * <pre>
 * TODO example
 * </pre>
 * 
 * </p>
 * <p>
 * last reviewed: 0000-00-00
 * </p>
 * 
 * @author <a href="mailto:alexanderkerner24@gmail.com">Alexander Kerner</a>
 * 
 * @param <I>
 * @param <O>
 */
public interface Decorator<I, O> {

    O decorate(I i);

}

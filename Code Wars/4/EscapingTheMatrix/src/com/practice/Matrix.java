package com.practice;

public class Matrix {
    public static <T extends Exception> void enter() throws T{
        throw (T) new Neo();
        //ExceptionUtil.throwUnchecked(new Neo());
    }
}

class ExceptionUtil {
    
    private static class ThrowableWrapper extends Throwable {
        
        private final Throwable throwable;
        
        public ThrowableWrapper(Throwable throwable){
            this.throwable = throwable;
        }
        
        @SuppressWarnings("unchecked") //It is all about subclassing and overriding with the Suppress annotation!
        public <T extends Throwable> T throwNested() throws T{
            throw (T) throwable;
        }
    }
    
    public static <T extends Throwable> void throwUnchecked(T throwable){
        throw new ThrowableWrapper(throwable).throwNested();
    }
    
}

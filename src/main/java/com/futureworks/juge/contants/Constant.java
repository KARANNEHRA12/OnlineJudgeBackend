package com.futureworks.juge.contants;

public class Constant {
    public static class STATUS{
        public static final int FAILED  = 0;
        public static final int SUCCESS = 1;
        public static final int ERROR   = 2;
        public static final int ABORD   = 3;
    }

    public static class ERROR_CODE{
        public static final int DATABASE_ERROR = 1000000;
        public static final int IO_ERROR       = 1000002;
        public static final int LOGIC_ERROR    = 1000003;
        public static final int UNNONE         = 1000004;
        public static final int NONE           = 2000000;
    }

    public static class PERSON_TYPE{
        public static final int STUDENT = 100000;
        public static final int TEACHER = 100002;
        public static final int ADMIN   = 100003;
        public static final int OTHER   = 100004;
    }

}

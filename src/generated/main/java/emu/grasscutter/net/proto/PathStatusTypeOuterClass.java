// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PathStatusType.proto

package emu.grasscutter.net.proto;

public final class PathStatusTypeOuterClass {
    private PathStatusTypeOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }
    /** Protobuf enum {@code PathStatusType} */
    public enum PathStatusType implements com.google.protobuf.ProtocolMessageEnum {
        /** <code>PATH_STATUS_TYPE_FAIL = 0;</code> */
        PATH_STATUS_TYPE_FAIL(0),
        /** <code>PATH_STATUS_TYPE_SUCC = 1;</code> */
        PATH_STATUS_TYPE_SUCC(1),
        /** <code>PATH_STATUS_TYPE_PARTIAL = 2;</code> */
        PATH_STATUS_TYPE_PARTIAL(2),
        UNRECOGNIZED(-1),
        ;

        /** <code>PATH_STATUS_TYPE_FAIL = 0;</code> */
        public static final int PATH_STATUS_TYPE_FAIL_VALUE = 0;
        /** <code>PATH_STATUS_TYPE_SUCC = 1;</code> */
        public static final int PATH_STATUS_TYPE_SUCC_VALUE = 1;
        /** <code>PATH_STATUS_TYPE_PARTIAL = 2;</code> */
        public static final int PATH_STATUS_TYPE_PARTIAL_VALUE = 2;

        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new java.lang.IllegalArgumentException(
                        "Can't get the number of an unknown enum value.");
            }
            return value;
        }

        /**
         * @param value The numeric wire value of the corresponding enum entry.
         * @return The enum associated with the given numeric wire value.
         * @deprecated Use {@link #forNumber(int)} instead.
         */
        @java.lang.Deprecated
        public static PathStatusType valueOf(int value) {
            return forNumber(value);
        }

        /**
         * @param value The numeric wire value of the corresponding enum entry.
         * @return The enum associated with the given numeric wire value.
         */
        public static PathStatusType forNumber(int value) {
            switch (value) {
                case 0:
                    return PATH_STATUS_TYPE_FAIL;
                case 1:
                    return PATH_STATUS_TYPE_SUCC;
                case 2:
                    return PATH_STATUS_TYPE_PARTIAL;
                default:
                    return null;
            }
        }

        public static com.google.protobuf.Internal.EnumLiteMap<PathStatusType> internalGetValueMap() {
            return internalValueMap;
        }

        private static final com.google.protobuf.Internal.EnumLiteMap<PathStatusType> internalValueMap =
                new com.google.protobuf.Internal.EnumLiteMap<PathStatusType>() {
                    public PathStatusType findValueByNumber(int number) {
                        return PathStatusType.forNumber(number);
                    }
                };

        public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == UNRECOGNIZED) {
                throw new java.lang.IllegalStateException(
                        "Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(ordinal());
        }

        public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
            return emu.grasscutter.net.proto.PathStatusTypeOuterClass.getDescriptor()
                    .getEnumTypes()
                    .get(0);
        }

        private static final PathStatusType[] VALUES = values();

        public static PathStatusType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[desc.getIndex()];
        }

        private final int value;

        private PathStatusType(int value) {
            this.value = value;
        }

        // @@protoc_insertion_point(enum_scope:PathStatusType)
    }

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\024PathStatusType.proto*d\n\016PathStatusType"
                    + "\022\031\n\025PATH_STATUS_TYPE_FAIL\020\000\022\031\n\025PATH_STAT"
                    + "US_TYPE_SUCC\020\001\022\034\n\030PATH_STATUS_TYPE_PARTI"
                    + "AL\020\002B\033\n\031emu.grasscutter.net.protob\006proto"
                    + "3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    }

    // @@protoc_insertion_point(outer_class_scope)
}
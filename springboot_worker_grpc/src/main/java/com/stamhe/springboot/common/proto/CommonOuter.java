// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Common.proto

package com.stamhe.springboot.common.proto;

public final class CommonOuter {
  private CommonOuter() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_stamhe_springboot_common_proto_CommonReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_stamhe_springboot_common_proto_CommonReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014Common.proto\022\"com.stamhe.springboot.co" +
      "mmon.proto\":\n\013CommonReply\022\017\n\007Message\030\001 \001" +
      "(\t\022\014\n\004Code\030\002 \001(\005\022\014\n\004Data\030\003 \001(\tB3\n\"com.st" +
      "amhe.springboot.common.protoB\013CommonOute" +
      "rP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_stamhe_springboot_common_proto_CommonReply_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_stamhe_springboot_common_proto_CommonReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_stamhe_springboot_common_proto_CommonReply_descriptor,
        new java.lang.String[] { "Message", "Code", "Data", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

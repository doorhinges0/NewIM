// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: entity_schema.proto

package com.whosbean.newim.entity;

public interface ExchangeMessageOrBuilder
    extends com.google.protobuf.MessageOrBuilder {

  // required string messageId = 1;
  /**
   * <code>required string messageId = 1;</code>
   */
  boolean hasMessageId();
  /**
   * <code>required string messageId = 1;</code>
   */
  java.lang.String getMessageId();
  /**
   * <code>required string messageId = 1;</code>
   */
  com.google.protobuf.ByteString
      getMessageIdBytes();

  // optional string message = 2;
  /**
   * <code>optional string message = 2;</code>
   */
  boolean hasMessage();
  /**
   * <code>optional string message = 2;</code>
   */
  java.lang.String getMessage();
  /**
   * <code>optional string message = 2;</code>
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  // optional string chatPath = 3;
  /**
   * <code>optional string chatPath = 3;</code>
   */
  boolean hasChatPath();
  /**
   * <code>optional string chatPath = 3;</code>
   */
  java.lang.String getChatPath();
  /**
   * <code>optional string chatPath = 3;</code>
   */
  com.google.protobuf.ByteString
      getChatPathBytes();

  // optional string chatRoomId = 4;
  /**
   * <code>optional string chatRoomId = 4;</code>
   */
  boolean hasChatRoomId();
  /**
   * <code>optional string chatRoomId = 4;</code>
   */
  java.lang.String getChatRoomId();
  /**
   * <code>optional string chatRoomId = 4;</code>
   */
  com.google.protobuf.ByteString
      getChatRoomIdBytes();

  // optional string msgPath = 5;
  /**
   * <code>optional string msgPath = 5;</code>
   */
  boolean hasMsgPath();
  /**
   * <code>optional string msgPath = 5;</code>
   */
  java.lang.String getMsgPath();
  /**
   * <code>optional string msgPath = 5;</code>
   */
  com.google.protobuf.ByteString
      getMsgPathBytes();

  // repeated int32 channelId = 6;
  /**
   * <code>repeated int32 channelId = 6;</code>
   */
  java.util.List<java.lang.Integer> getChannelIdList();
  /**
   * <code>repeated int32 channelId = 6;</code>
   */
  int getChannelIdCount();
  /**
   * <code>repeated int32 channelId = 6;</code>
   */
  int getChannelId(int index);
}
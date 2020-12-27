// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.google.protobuf.descriptor

/** Describes a complete .proto file.
  *
  * @param name
  *   file name, relative to root of source tree
  * @param package
  *   e.g. "foo", "foo.bar", etc.
  * @param dependency
  *   Names of files imported by this file.
  * @param publicDependency
  *   Indexes of the public imported files in the dependency list above.
  * @param weakDependency
  *   Indexes of the weak imported files in the dependency list.
  *   For Google-internal migration only. Do not use.
  * @param messageType
  *   All top-level definitions in this file.
  * @param sourceCodeInfo
  *   This field contains optional information about the original source code.
  *   You may safely remove this entire field without harming runtime
  *   functionality of the descriptors -- the information is needed only by
  *   development tools.
  * @param syntax
  *   The syntax of the proto file.
  *   The supported values are "proto2" and "proto3".
  */
@SerialVersionUID(0L)
final case class FileDescriptorProto(
    name: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None,
    `package`: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None,
    dependency: _root_.scala.Seq[_root_.scala.Predef.String] = _root_.scala.Seq.empty,
    publicDependency: _root_.scala.Seq[_root_.scala.Int] = _root_.scala.Seq.empty,
    weakDependency: _root_.scala.Seq[_root_.scala.Int] = _root_.scala.Seq.empty,
    messageType: _root_.scala.Seq[com.google.protobuf.descriptor.DescriptorProto] = _root_.scala.Seq.empty,
    enumType: _root_.scala.Seq[com.google.protobuf.descriptor.EnumDescriptorProto] = _root_.scala.Seq.empty,
    service: _root_.scala.Seq[com.google.protobuf.descriptor.ServiceDescriptorProto] = _root_.scala.Seq.empty,
    extension: _root_.scala.Seq[com.google.protobuf.descriptor.FieldDescriptorProto] = _root_.scala.Seq.empty,
    options: _root_.scala.Option[com.google.protobuf.descriptor.FileOptions] = _root_.scala.None,
    sourceCodeInfo: _root_.scala.Option[com.google.protobuf.descriptor.SourceCodeInfo] = _root_.scala.None,
    syntax: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[FileDescriptorProto] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (name.isDefined) {
        val __value = name.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
      };
      if (`package`.isDefined) {
        val __value = `package`.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
      };
      dependency.foreach { __item =>
        val __value = __item
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, __value)
      }
      publicDependency.foreach { __item =>
        val __value = __item
        __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(10, __value)
      }
      weakDependency.foreach { __item =>
        val __value = __item
        __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(11, __value)
      }
      messageType.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      enumType.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      service.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      extension.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      if (options.isDefined) {
        val __value = options.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      if (sourceCodeInfo.isDefined) {
        val __value = sourceCodeInfo.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      if (syntax.isDefined) {
        val __value = syntax.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(12, __value)
      };
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      name.foreach { __v =>
        val __m = __v
        _output__.writeString(1, __m)
      };
      `package`.foreach { __v =>
        val __m = __v
        _output__.writeString(2, __m)
      };
      dependency.foreach { __v =>
        val __m = __v
        _output__.writeString(3, __m)
      };
      messageType.foreach { __v =>
        val __m = __v
        _output__.writeTag(4, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      enumType.foreach { __v =>
        val __m = __v
        _output__.writeTag(5, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      service.foreach { __v =>
        val __m = __v
        _output__.writeTag(6, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      extension.foreach { __v =>
        val __m = __v
        _output__.writeTag(7, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      options.foreach { __v =>
        val __m = __v
        _output__.writeTag(8, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      sourceCodeInfo.foreach { __v =>
        val __m = __v
        _output__.writeTag(9, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      publicDependency.foreach { __v =>
        val __m = __v
        _output__.writeInt32(10, __m)
      };
      weakDependency.foreach { __v =>
        val __m = __v
        _output__.writeInt32(11, __m)
      };
      syntax.foreach { __v =>
        val __m = __v
        _output__.writeString(12, __m)
      };
      unknownFields.writeTo(_output__)
    }
    def getName: _root_.scala.Predef.String = name.getOrElse("")
    def clearName: FileDescriptorProto = copy(name = _root_.scala.None)
    def withName(__v: _root_.scala.Predef.String): FileDescriptorProto = copy(name = Option(__v))
    def getPackage: _root_.scala.Predef.String = `package`.getOrElse("")
    def clearPackage: FileDescriptorProto = copy(`package` = _root_.scala.None)
    def withPackage(__v: _root_.scala.Predef.String): FileDescriptorProto = copy(`package` = Option(__v))
    def clearDependency = copy(dependency = _root_.scala.Seq.empty)
    def addDependency(__vs: _root_.scala.Predef.String*): FileDescriptorProto = addAllDependency(__vs)
    def addAllDependency(__vs: Iterable[_root_.scala.Predef.String]): FileDescriptorProto = copy(dependency = dependency ++ __vs)
    def withDependency(__v: _root_.scala.Seq[_root_.scala.Predef.String]): FileDescriptorProto = copy(dependency = __v)
    def clearPublicDependency = copy(publicDependency = _root_.scala.Seq.empty)
    def addPublicDependency(__vs: _root_.scala.Int*): FileDescriptorProto = addAllPublicDependency(__vs)
    def addAllPublicDependency(__vs: Iterable[_root_.scala.Int]): FileDescriptorProto = copy(publicDependency = publicDependency ++ __vs)
    def withPublicDependency(__v: _root_.scala.Seq[_root_.scala.Int]): FileDescriptorProto = copy(publicDependency = __v)
    def clearWeakDependency = copy(weakDependency = _root_.scala.Seq.empty)
    def addWeakDependency(__vs: _root_.scala.Int*): FileDescriptorProto = addAllWeakDependency(__vs)
    def addAllWeakDependency(__vs: Iterable[_root_.scala.Int]): FileDescriptorProto = copy(weakDependency = weakDependency ++ __vs)
    def withWeakDependency(__v: _root_.scala.Seq[_root_.scala.Int]): FileDescriptorProto = copy(weakDependency = __v)
    def clearMessageType = copy(messageType = _root_.scala.Seq.empty)
    def addMessageType(__vs: com.google.protobuf.descriptor.DescriptorProto*): FileDescriptorProto = addAllMessageType(__vs)
    def addAllMessageType(__vs: Iterable[com.google.protobuf.descriptor.DescriptorProto]): FileDescriptorProto = copy(messageType = messageType ++ __vs)
    def withMessageType(__v: _root_.scala.Seq[com.google.protobuf.descriptor.DescriptorProto]): FileDescriptorProto = copy(messageType = __v)
    def clearEnumType = copy(enumType = _root_.scala.Seq.empty)
    def addEnumType(__vs: com.google.protobuf.descriptor.EnumDescriptorProto*): FileDescriptorProto = addAllEnumType(__vs)
    def addAllEnumType(__vs: Iterable[com.google.protobuf.descriptor.EnumDescriptorProto]): FileDescriptorProto = copy(enumType = enumType ++ __vs)
    def withEnumType(__v: _root_.scala.Seq[com.google.protobuf.descriptor.EnumDescriptorProto]): FileDescriptorProto = copy(enumType = __v)
    def clearService = copy(service = _root_.scala.Seq.empty)
    def addService(__vs: com.google.protobuf.descriptor.ServiceDescriptorProto*): FileDescriptorProto = addAllService(__vs)
    def addAllService(__vs: Iterable[com.google.protobuf.descriptor.ServiceDescriptorProto]): FileDescriptorProto = copy(service = service ++ __vs)
    def withService(__v: _root_.scala.Seq[com.google.protobuf.descriptor.ServiceDescriptorProto]): FileDescriptorProto = copy(service = __v)
    def clearExtension = copy(extension = _root_.scala.Seq.empty)
    def addExtension(__vs: com.google.protobuf.descriptor.FieldDescriptorProto*): FileDescriptorProto = addAllExtension(__vs)
    def addAllExtension(__vs: Iterable[com.google.protobuf.descriptor.FieldDescriptorProto]): FileDescriptorProto = copy(extension = extension ++ __vs)
    def withExtension(__v: _root_.scala.Seq[com.google.protobuf.descriptor.FieldDescriptorProto]): FileDescriptorProto = copy(extension = __v)
    def getOptions: com.google.protobuf.descriptor.FileOptions = options.getOrElse(com.google.protobuf.descriptor.FileOptions.defaultInstance)
    def clearOptions: FileDescriptorProto = copy(options = _root_.scala.None)
    def withOptions(__v: com.google.protobuf.descriptor.FileOptions): FileDescriptorProto = copy(options = Option(__v))
    def getSourceCodeInfo: com.google.protobuf.descriptor.SourceCodeInfo = sourceCodeInfo.getOrElse(com.google.protobuf.descriptor.SourceCodeInfo.defaultInstance)
    def clearSourceCodeInfo: FileDescriptorProto = copy(sourceCodeInfo = _root_.scala.None)
    def withSourceCodeInfo(__v: com.google.protobuf.descriptor.SourceCodeInfo): FileDescriptorProto = copy(sourceCodeInfo = Option(__v))
    def getSyntax: _root_.scala.Predef.String = syntax.getOrElse("")
    def clearSyntax: FileDescriptorProto = copy(syntax = _root_.scala.None)
    def withSyntax(__v: _root_.scala.Predef.String): FileDescriptorProto = copy(syntax = Option(__v))
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => name.orNull
        case 2 => `package`.orNull
        case 3 => dependency
        case 10 => publicDependency
        case 11 => weakDependency
        case 4 => messageType
        case 5 => enumType
        case 6 => service
        case 7 => extension
        case 8 => options.orNull
        case 9 => sourceCodeInfo.orNull
        case 12 => syntax.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => name.map(_root_.scalapb.descriptors.PString).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 2 => `package`.map(_root_.scalapb.descriptors.PString).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 3 => _root_.scalapb.descriptors.PRepeated(dependency.iterator.map(_root_.scalapb.descriptors.PString).toVector)
        case 10 => _root_.scalapb.descriptors.PRepeated(publicDependency.iterator.map(_root_.scalapb.descriptors.PInt).toVector)
        case 11 => _root_.scalapb.descriptors.PRepeated(weakDependency.iterator.map(_root_.scalapb.descriptors.PInt).toVector)
        case 4 => _root_.scalapb.descriptors.PRepeated(messageType.iterator.map(_.toPMessage).toVector)
        case 5 => _root_.scalapb.descriptors.PRepeated(enumType.iterator.map(_.toPMessage).toVector)
        case 6 => _root_.scalapb.descriptors.PRepeated(service.iterator.map(_.toPMessage).toVector)
        case 7 => _root_.scalapb.descriptors.PRepeated(extension.iterator.map(_.toPMessage).toVector)
        case 8 => options.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 9 => sourceCodeInfo.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 12 => syntax.map(_root_.scalapb.descriptors.PString).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.descriptor.FileDescriptorProto
    // @@protoc_insertion_point(GeneratedMessage[google.protobuf.FileDescriptorProto])
}

object FileDescriptorProto extends scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.FileDescriptorProto] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.FileDescriptorProto] = this
  override protected def actualParseFrom(input: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.descriptor.FileDescriptorProto = newBuilder.merge(input).result()
  def merge(`_message__`: com.google.protobuf.descriptor.FileDescriptorProto, `_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.descriptor.FileDescriptorProto = newBuilder(_message__).merge(_input__).result()
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.descriptor.FileDescriptorProto] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.protobuf.descriptor.FileDescriptorProto(
        name = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]]),
        `package` = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]]),
        dependency = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Seq[_root_.scala.Predef.String]]).getOrElse(_root_.scala.Seq.empty),
        publicDependency = __fieldsMap.get(scalaDescriptor.findFieldByNumber(10).get).map(_.as[_root_.scala.Seq[_root_.scala.Int]]).getOrElse(_root_.scala.Seq.empty),
        weakDependency = __fieldsMap.get(scalaDescriptor.findFieldByNumber(11).get).map(_.as[_root_.scala.Seq[_root_.scala.Int]]).getOrElse(_root_.scala.Seq.empty),
        messageType = __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).map(_.as[_root_.scala.Seq[com.google.protobuf.descriptor.DescriptorProto]]).getOrElse(_root_.scala.Seq.empty),
        enumType = __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).map(_.as[_root_.scala.Seq[com.google.protobuf.descriptor.EnumDescriptorProto]]).getOrElse(_root_.scala.Seq.empty),
        service = __fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).map(_.as[_root_.scala.Seq[com.google.protobuf.descriptor.ServiceDescriptorProto]]).getOrElse(_root_.scala.Seq.empty),
        extension = __fieldsMap.get(scalaDescriptor.findFieldByNumber(7).get).map(_.as[_root_.scala.Seq[com.google.protobuf.descriptor.FieldDescriptorProto]]).getOrElse(_root_.scala.Seq.empty),
        options = __fieldsMap.get(scalaDescriptor.findFieldByNumber(8).get).flatMap(_.as[_root_.scala.Option[com.google.protobuf.descriptor.FileOptions]]),
        sourceCodeInfo = __fieldsMap.get(scalaDescriptor.findFieldByNumber(9).get).flatMap(_.as[_root_.scala.Option[com.google.protobuf.descriptor.SourceCodeInfo]]),
        syntax = __fieldsMap.get(scalaDescriptor.findFieldByNumber(12).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = DescriptorProtoCompanion.javaDescriptor.getMessageTypes().get(1)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = DescriptorProtoCompanion.scalaDescriptor.messages(1)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 4 => __out = com.google.protobuf.descriptor.DescriptorProto
      case 5 => __out = com.google.protobuf.descriptor.EnumDescriptorProto
      case 6 => __out = com.google.protobuf.descriptor.ServiceDescriptorProto
      case 7 => __out = com.google.protobuf.descriptor.FieldDescriptorProto
      case 8 => __out = com.google.protobuf.descriptor.FileOptions
      case 9 => __out = com.google.protobuf.descriptor.SourceCodeInfo
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.protobuf.descriptor.FileDescriptorProto(
    name = _root_.scala.None,
    `package` = _root_.scala.None,
    dependency = _root_.scala.Seq.empty,
    publicDependency = _root_.scala.Seq.empty,
    weakDependency = _root_.scala.Seq.empty,
    messageType = _root_.scala.Seq.empty,
    enumType = _root_.scala.Seq.empty,
    service = _root_.scala.Seq.empty,
    extension = _root_.scala.Seq.empty,
    options = _root_.scala.None,
    sourceCodeInfo = _root_.scala.None,
    syntax = _root_.scala.None
  )
  final class Builder private (
    private var __name: _root_.scala.Option[_root_.scala.Predef.String],
    private var __package: _root_.scala.Option[_root_.scala.Predef.String],
    private var __dependency: collection.mutable.Builder[_root_.scala.Predef.String, _root_.scala.Seq[_root_.scala.Predef.String]],
    private var __publicDependency: collection.mutable.Builder[_root_.scala.Int, _root_.scala.Seq[_root_.scala.Int]],
    private var __weakDependency: collection.mutable.Builder[_root_.scala.Int, _root_.scala.Seq[_root_.scala.Int]],
    private var __messageType: collection.mutable.Builder[com.google.protobuf.descriptor.DescriptorProto, _root_.scala.Seq[com.google.protobuf.descriptor.DescriptorProto]],
    private var __enumType: collection.mutable.Builder[com.google.protobuf.descriptor.EnumDescriptorProto, _root_.scala.Seq[com.google.protobuf.descriptor.EnumDescriptorProto]],
    private var __service: collection.mutable.Builder[com.google.protobuf.descriptor.ServiceDescriptorProto, _root_.scala.Seq[com.google.protobuf.descriptor.ServiceDescriptorProto]],
    private var __extension: collection.mutable.Builder[com.google.protobuf.descriptor.FieldDescriptorProto, _root_.scala.Seq[com.google.protobuf.descriptor.FieldDescriptorProto]],
    private var __options: _root_.scala.Option[com.google.protobuf.descriptor.FileOptions],
    private var __sourceCodeInfo: _root_.scala.Option[com.google.protobuf.descriptor.SourceCodeInfo],
    private var __syntax: _root_.scala.Option[_root_.scala.Predef.String],
    private var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder
  ) extends _root_.scalapb.MessageBuilder[com.google.protobuf.descriptor.FileDescriptorProto] {
    def merge(`_input__`: _root_.com.google.protobuf.CodedInputStream): this.type = {
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __name = Option(_input__.readStringRequireUtf8())
          case 18 =>
            __package = Option(_input__.readStringRequireUtf8())
          case 26 =>
            __dependency += _input__.readStringRequireUtf8()
          case 80 =>
            __publicDependency += _input__.readInt32()
          case 82 => {
            val length = _input__.readRawVarint32()
            val oldLimit = _input__.pushLimit(length)
            while (_input__.getBytesUntilLimit > 0) {
              __publicDependency += _input__.readInt32()
            }
            _input__.popLimit(oldLimit)
          }
          case 88 =>
            __weakDependency += _input__.readInt32()
          case 90 => {
            val length = _input__.readRawVarint32()
            val oldLimit = _input__.pushLimit(length)
            while (_input__.getBytesUntilLimit > 0) {
              __weakDependency += _input__.readInt32()
            }
            _input__.popLimit(oldLimit)
          }
          case 34 =>
            __messageType += _root_.scalapb.LiteParser.readMessage[com.google.protobuf.descriptor.DescriptorProto](_input__)
          case 42 =>
            __enumType += _root_.scalapb.LiteParser.readMessage[com.google.protobuf.descriptor.EnumDescriptorProto](_input__)
          case 50 =>
            __service += _root_.scalapb.LiteParser.readMessage[com.google.protobuf.descriptor.ServiceDescriptorProto](_input__)
          case 58 =>
            __extension += _root_.scalapb.LiteParser.readMessage[com.google.protobuf.descriptor.FieldDescriptorProto](_input__)
          case 66 =>
            __options = Option(__options.fold(_root_.scalapb.LiteParser.readMessage[com.google.protobuf.descriptor.FileOptions](_input__))(_root_.scalapb.LiteParser.readMessage(_input__, _)))
          case 74 =>
            __sourceCodeInfo = Option(__sourceCodeInfo.fold(_root_.scalapb.LiteParser.readMessage[com.google.protobuf.descriptor.SourceCodeInfo](_input__))(_root_.scalapb.LiteParser.readMessage(_input__, _)))
          case 98 =>
            __syntax = Option(_input__.readStringRequireUtf8())
          case tag =>
            if (_unknownFields__ == null) {
              _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
            }
            _unknownFields__.parseField(tag, _input__)
        }
      }
      this
    }
    def result(): com.google.protobuf.descriptor.FileDescriptorProto = {
      com.google.protobuf.descriptor.FileDescriptorProto(
          name = __name,
          `package` = __package,
          dependency = __dependency.result(),
          publicDependency = __publicDependency.result(),
          weakDependency = __weakDependency.result(),
          messageType = __messageType.result(),
          enumType = __enumType.result(),
          service = __service.result(),
          extension = __extension.result(),
          options = __options,
          sourceCodeInfo = __sourceCodeInfo,
          syntax = __syntax,
          unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
      )
    }
  }
  object Builder extends _root_.scalapb.MessageBuilderCompanion[com.google.protobuf.descriptor.FileDescriptorProto, com.google.protobuf.descriptor.FileDescriptorProto.Builder] {
    def apply(): Builder = new Builder(
      __name = _root_.scala.None,
      __package = _root_.scala.None,
      __dependency = _root_.scala.collection.immutable.Vector.newBuilder[_root_.scala.Predef.String],
      __publicDependency = _root_.scala.collection.immutable.Vector.newBuilder[_root_.scala.Int],
      __weakDependency = _root_.scala.collection.immutable.Vector.newBuilder[_root_.scala.Int],
      __messageType = _root_.scala.collection.immutable.Vector.newBuilder[com.google.protobuf.descriptor.DescriptorProto],
      __enumType = _root_.scala.collection.immutable.Vector.newBuilder[com.google.protobuf.descriptor.EnumDescriptorProto],
      __service = _root_.scala.collection.immutable.Vector.newBuilder[com.google.protobuf.descriptor.ServiceDescriptorProto],
      __extension = _root_.scala.collection.immutable.Vector.newBuilder[com.google.protobuf.descriptor.FieldDescriptorProto],
      __options = _root_.scala.None,
      __sourceCodeInfo = _root_.scala.None,
      __syntax = _root_.scala.None,
      `_unknownFields__` = null
    )
    def apply(`_message__`: com.google.protobuf.descriptor.FileDescriptorProto): Builder = new Builder(
      __name = _message__.name,
      __package = _message__.`package`,
      __dependency = _root_.scala.collection.immutable.Vector.newBuilder[_root_.scala.Predef.String] ++= _message__.dependency,
      __publicDependency = _root_.scala.collection.immutable.Vector.newBuilder[_root_.scala.Int] ++= _message__.publicDependency,
      __weakDependency = _root_.scala.collection.immutable.Vector.newBuilder[_root_.scala.Int] ++= _message__.weakDependency,
      __messageType = _root_.scala.collection.immutable.Vector.newBuilder[com.google.protobuf.descriptor.DescriptorProto] ++= _message__.messageType,
      __enumType = _root_.scala.collection.immutable.Vector.newBuilder[com.google.protobuf.descriptor.EnumDescriptorProto] ++= _message__.enumType,
      __service = _root_.scala.collection.immutable.Vector.newBuilder[com.google.protobuf.descriptor.ServiceDescriptorProto] ++= _message__.service,
      __extension = _root_.scala.collection.immutable.Vector.newBuilder[com.google.protobuf.descriptor.FieldDescriptorProto] ++= _message__.extension,
      __options = _message__.options,
      __sourceCodeInfo = _message__.sourceCodeInfo,
      __syntax = _message__.syntax,
      `_unknownFields__` = new _root_.scalapb.UnknownFieldSet.Builder(_message__.unknownFields)
    )
  }
  def newBuilder: Builder = com.google.protobuf.descriptor.FileDescriptorProto.Builder()
  def newBuilder(a: com.google.protobuf.descriptor.FileDescriptorProto): Builder = com.google.protobuf.descriptor.FileDescriptorProto.Builder(a)
  implicit class FileDescriptorProtoLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.descriptor.FileDescriptorProto]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.protobuf.descriptor.FileDescriptorProto](_l) {
    def name: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getName)((c_, f_) => c_.copy(name = Option(f_)))
    def optionalName: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def `package`: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getPackage)((c_, f_) => c_.copy(`package` = Option(f_)))
    def optionalPackage: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.`package`)((c_, f_) => c_.copy(`package` = f_))
    def dependency: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.scala.Predef.String]] = field(_.dependency)((c_, f_) => c_.copy(dependency = f_))
    def publicDependency: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.scala.Int]] = field(_.publicDependency)((c_, f_) => c_.copy(publicDependency = f_))
    def weakDependency: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.scala.Int]] = field(_.weakDependency)((c_, f_) => c_.copy(weakDependency = f_))
    def messageType: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[com.google.protobuf.descriptor.DescriptorProto]] = field(_.messageType)((c_, f_) => c_.copy(messageType = f_))
    def enumType: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[com.google.protobuf.descriptor.EnumDescriptorProto]] = field(_.enumType)((c_, f_) => c_.copy(enumType = f_))
    def service: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[com.google.protobuf.descriptor.ServiceDescriptorProto]] = field(_.service)((c_, f_) => c_.copy(service = f_))
    def extension: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[com.google.protobuf.descriptor.FieldDescriptorProto]] = field(_.extension)((c_, f_) => c_.copy(extension = f_))
    def options: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.descriptor.FileOptions] = field(_.getOptions)((c_, f_) => c_.copy(options = Option(f_)))
    def optionalOptions: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.protobuf.descriptor.FileOptions]] = field(_.options)((c_, f_) => c_.copy(options = f_))
    def sourceCodeInfo: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.descriptor.SourceCodeInfo] = field(_.getSourceCodeInfo)((c_, f_) => c_.copy(sourceCodeInfo = Option(f_)))
    def optionalSourceCodeInfo: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.protobuf.descriptor.SourceCodeInfo]] = field(_.sourceCodeInfo)((c_, f_) => c_.copy(sourceCodeInfo = f_))
    def syntax: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getSyntax)((c_, f_) => c_.copy(syntax = Option(f_)))
    def optionalSyntax: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.syntax)((c_, f_) => c_.copy(syntax = f_))
  }
  final val NAME_FIELD_NUMBER = 1
  final val PACKAGE_FIELD_NUMBER = 2
  final val DEPENDENCY_FIELD_NUMBER = 3
  final val PUBLIC_DEPENDENCY_FIELD_NUMBER = 10
  final val WEAK_DEPENDENCY_FIELD_NUMBER = 11
  final val MESSAGE_TYPE_FIELD_NUMBER = 4
  final val ENUM_TYPE_FIELD_NUMBER = 5
  final val SERVICE_FIELD_NUMBER = 6
  final val EXTENSION_FIELD_NUMBER = 7
  final val OPTIONS_FIELD_NUMBER = 8
  final val SOURCE_CODE_INFO_FIELD_NUMBER = 9
  final val SYNTAX_FIELD_NUMBER = 12
  def of(
    name: _root_.scala.Option[_root_.scala.Predef.String],
    `package`: _root_.scala.Option[_root_.scala.Predef.String],
    dependency: _root_.scala.Seq[_root_.scala.Predef.String],
    publicDependency: _root_.scala.Seq[_root_.scala.Int],
    weakDependency: _root_.scala.Seq[_root_.scala.Int],
    messageType: _root_.scala.Seq[com.google.protobuf.descriptor.DescriptorProto],
    enumType: _root_.scala.Seq[com.google.protobuf.descriptor.EnumDescriptorProto],
    service: _root_.scala.Seq[com.google.protobuf.descriptor.ServiceDescriptorProto],
    extension: _root_.scala.Seq[com.google.protobuf.descriptor.FieldDescriptorProto],
    options: _root_.scala.Option[com.google.protobuf.descriptor.FileOptions],
    sourceCodeInfo: _root_.scala.Option[com.google.protobuf.descriptor.SourceCodeInfo],
    syntax: _root_.scala.Option[_root_.scala.Predef.String]
  ): _root_.com.google.protobuf.descriptor.FileDescriptorProto = _root_.com.google.protobuf.descriptor.FileDescriptorProto(
    name,
    `package`,
    dependency,
    publicDependency,
    weakDependency,
    messageType,
    enumType,
    service,
    extension,
    options,
    sourceCodeInfo,
    syntax
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[google.protobuf.FileDescriptorProto])
}
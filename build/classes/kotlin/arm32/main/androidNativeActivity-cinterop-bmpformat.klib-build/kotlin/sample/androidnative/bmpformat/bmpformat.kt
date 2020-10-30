@file:kotlinx.cinterop.InteropStubs
@file:Suppress("UNUSED_VARIABLE", "UNUSED_EXPRESSION")
package sample.androidnative.bmpformat

import kotlin.native.SymbolName
import kotlinx.cinterop.internal.*
import kotlinx.cinterop.*
import platform.posix.int32_t
import platform.posix.int32_tVar
import platform.posix.uint16_t
import platform.posix.uint16_tVar
import platform.posix.uint32_t
import platform.posix.uint32_tVar
import platform.posix.uint8_tVar

// NOTE THIS FILE IS AUTO-GENERATED

@CStruct("struct __attribute__((packed)) { unsigned short p0; unsigned int p1; unsigned int p2; unsigned char p3[8]; int p4; int p5; unsigned char p6[2]; unsigned short p7; unsigned char p8[24]; }")
class BMPHeader(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : CStructVar.Type(54, 1)
    
    var magic: uint16_t
        get() = memberAt<uint16_tVar>(0).value
        set(value) { memberAt<uint16_tVar>(0).value = value }
    
    var size: uint32_t
        get() = memberAt<uint32_tVar>(2).value
        set(value) { memberAt<uint32_tVar>(2).value = value }
    
    var zero: uint32_t
        get() = memberAt<uint32_tVar>(6).value
        set(value) { memberAt<uint32_tVar>(6).value = value }
    
    val padding1: CArrayPointer<uint8_tVar>
        get() = arrayMemberAt(10)
    
    var width: int32_t
        get() = memberAt<int32_tVar>(18).value
        set(value) { memberAt<int32_tVar>(18).value = value }
    
    var height: int32_t
        get() = memberAt<int32_tVar>(22).value
        set(value) { memberAt<int32_tVar>(22).value = value }
    
    val padding2: CArrayPointer<uint8_tVar>
        get() = arrayMemberAt(26)
    
    var bits: uint16_t
        get() = memberAt<uint16_tVar>(28).value
        set(value) { memberAt<uint16_tVar>(28).value = value }
    
    val padding3: CArrayPointer<uint8_tVar>
        get() = arrayMemberAt(30)
}

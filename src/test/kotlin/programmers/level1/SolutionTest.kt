package programmers.level1

import programmers.level1.newid.NewIdGenerator
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SolutionTest {

    @Test
    fun `level1 - 신규 아이디 추천`() {
        val subject = NewIdGenerator()

        assertEquals("bat.y.abcdefghi", subject.generate( "...!@BaT#*..y.abcdefghijklm"))
        assertEquals("z--", subject.generate( "z-+.^."))
        assertEquals("aaa", subject.generate( "=.="))
        assertEquals("123_.def", subject.generate( "123_.def"))
        assertEquals("abcdefghijklmn", subject.generate( "abcdefghijklmn.p"))
    }
}
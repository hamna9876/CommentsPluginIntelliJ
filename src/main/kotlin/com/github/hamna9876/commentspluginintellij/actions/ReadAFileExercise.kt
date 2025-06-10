package com.github.hamna9876.commentspluginintellij.actions

import java.io.File
import java.nio.charset.Charset

fun main()
{
    val text = readFromFile("src/main/resources/tasks (7).yaml")
//    println(text)
//    println("Hello World")
//    println(countCharacters(text))
//    println(isStandardComment("//tuiethie comment"))
    val commentsText = readFromFile("src/main/resources/exampleCommentsFile.txt")
//    print(countComments(commentsText))

    print(commentIndexesArray(commentsText))

}

     private fun readFromFile(path:String) : String {
        val file = File(path)
        return file.readText(Charset.defaultCharset())
     }

    //input is the file, should return an array of the indexes of lines where there is a comment!
//    fun findCommentUsingRegex(file: String) : ArrayList<Int> {
//        for(currentLine in file) {
//           // if(currentLine.matches())
//        }
//    }


    fun countCharacters(file: String) : Map<Char, Int> {
        val charMap = mutableMapOf<Char, Int>()
        for (currentChar in file)
        {
            if (charMap.contains(currentChar)) {
                val iterateCurrentValue = charMap[currentChar]!! + 1
                charMap.put(currentChar, iterateCurrentValue)
            } else {
                charMap.put(currentChar, 0)
            }
        }
        return charMap
    }


    fun isStandardComment(line: String) : Boolean {
        return line.trimStart().startsWith("//");
    }

    fun countComments(file: String) : Int {
        var count = 0
        val lines = file.lines()
        for (line in lines)
        {
            if (isStandardComment(line)) {
                println(line)
                count++
            }
        }
        return count
    }

    fun commentIndexesArray(file: String) : ArrayList<Int> {
        val indexArr = ArrayList<Int>()
        var lineIndex = 0;
        val lines = file.lines()
        for (line in lines)
        {
            if (isStandardComment(line)) {
                println(lineIndex)
                indexArr.add(lineIndex)
            }
            lineIndex++
        }
        return indexArr
    }

//process lines
// match other forms of comments

//}



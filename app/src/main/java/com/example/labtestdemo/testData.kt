package edu.inf2007.eitest

data class Test(
    val question: String = "No question",
    val options: List<String> = listOf("Option 1", "Option 2", "Option 3"),
    val scores: List<Int> = listOf(1, 2, 3)
)
object testData {
    val questionsBank = listOf(
        Test(
            "How do you feel about joining university club activities?",
            listOf(
                "Extremely excited! Sign me up for everything.",
                "Interested in a few, but not too overwhelming.",
                "Prefer to focus on studies and personal time."
            ),
            listOf(10, 5, 2)
        ),
        Test(
            "What's your preferred way to spend a weekend in Singapore?",
            listOf(
                "Exploring events and attractions with friends.",
                "Hanging out with a small group of close friends.",
                "Enjoying some quiet time alone or with a book."
            ),
            listOf(8, 5, 2)
        ),
        Test(
            "How often do you try out new local food places with friends?",
            listOf(
                "Frequently, love discovering new spots.",
                "Occasionally, with a few trusted foodie friends.",
                "Rarely, I have my favorite go-to places."
            ),
            listOf(9, 6, 3)
        ),
        Test(
            "After a busy day of classes, how do you unwind?",
            listOf(
                "Chatting with friends at a nearby café.",
                "Having dinner with close friends.",
                "Taking a solitary stroll or enjoying quiet time."
            ),
            listOf(7, 4, 1)
        ),
        Test(
            "How do you prefer to communicate with classmates for group projects?",
            listOf(
                "Face-to-face meetings and discussions.",
                "Online chats or group video calls.",
                "Emails or individual discussions."
            ),
            listOf(8, 5, 2)
        ),
        Test(
            "When planning a day out, what's your ideal group size?",
            listOf(
                "The more, the merrier!",
                "A small group of close friends.",
                "Just myself or one or two friends."
            ),
            listOf(9, 6, 3)
        ),
        Test(
            "How do you cope with exam stress?",
            listOf(
                "Group study sessions with friends.",
                "Seeking support from close peers.",
                "Solitary study and self-reflection."
            ),
            listOf(7, 5, 2)
        ),
        Test(
            "What's your preferred way to celebrate the end of exams?",
            listOf(
                "Throwing a post-exam party.",
                "Celebrating with a few close friends.",
                "Enjoying a quiet and personal celebration."
            ),
            listOf(7, 4, 2)
        ),
        Test(
            "How do you feel about participating in university events?",
            listOf(
                "Always excited to be part of the crowd.",
                "Attend a few events that interest me.",
                "Prefer not to participate in large events."
            ),
            listOf(8, 5, 2)
        ),
        Test(
            "Your preferred study environment is...",
            listOf(
                "In a lively library with friends.",
                "In a quiet study area with a few friends.",
                "In a solitary space with minimal distractions."
            ),
            listOf(8, 5, 2)
        ),
        Test(
            "How do you approach meeting new friends in university?",
            listOf(
                "Eagerly and openly.",
                "Open-minded but selectively.",
                "Reserved and cautious."
            ),
            listOf(9, 6, 3)
        ),
        Test(
            "What's your reaction to being asked to join a university club?",
            listOf(
                "Excited to join and make new friends.",
                "Considering it, depending on interests.",
                "Likely to decline and focus on personal time."
            ),
            listOf(7, 4, 1)
        )
    )
}
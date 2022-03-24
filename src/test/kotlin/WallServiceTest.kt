import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {
        val serviceTest = WallService()
        val postTest = serviceTest.add(
            Post(
                0,
                0,
                0,
                0,
                0,
                "",
                0,
                0,
                false,
                Comments(0, canPost = false, groupsCanPost = false, canClose = false, canOpen = false),
                Copyright(0, "", "", ""),
                Likes(0, userLikes = false, canLike = false, canPublish = false),
                Reposts(0, false),
                Views(0),
                "",
                0,
                canPin = false,
                canDelete = false,
                canEdit = false,
                isPinned = false,
                markedAsAds = false,
                false,
                Donut(false, 0, false, ""),
                0
            )
        )
        assertEquals(postTest.id, 1)
    }

    @Test
    fun updateResultTrue() {
        val service = WallService()
        service.add(
            Post(
                0,
                0,
                0,
                0,
                0,
                "",
                0,
                0,
                false,
                Comments(0, canPost = false, groupsCanPost = false, canClose = false, canOpen = false),
                Copyright(0, "", "", ""),
                Likes(0, userLikes = false, canLike = false, canPublish = false),
                Reposts(0, false),
                Views(0),
                "",
                0,
                canPin = false,
                canDelete = false,
                canEdit = false,
                isPinned = false,
                markedAsAds = false,
                false,
                Donut(false, 0, false, ""),
                0
            )
        )
        service.add(
            Post(
                0,
                0,
                0,
                0,
                0,
                "",
                0,
                0,
                false,
                Comments(0, canPost = false, groupsCanPost = false, canClose = false, canOpen = false),
                Copyright(0, "", "", ""),
                Likes(0, userLikes = false, canLike = false, canPublish = false),
                Reposts(0, false),
                Views(0),
                "",
                0,
                canPin = false,
                canDelete = false,
                canEdit = false,
                isPinned = false,
                markedAsAds = false,
                false,
                Donut(false, 0, false, ""),
                0
            )
        )
        service.add(
            Post(
                0,
                0,
                0,
                0,
                0,
                "",
                0,
                0,
                false,
                Comments(0, canPost = false, groupsCanPost = false, canClose = false, canOpen = false),
                Copyright(0, "", "", ""),
                Likes(0, userLikes = false, canLike = false, canPublish = false),
                Reposts(0, false),
                Views(0),
                "",
                0,
                canPin = false,
                canDelete = false,
                canEdit = false,
                isPinned = false,
                markedAsAds = false,
                false,
                Donut(false, 0, false, ""),
                0
            )
        )

        val update = Post(
            2,
            0,
            0,
            0,
            0,
            "",
            0,
            0,
            false,
            Comments(0, canPost = false, groupsCanPost = false, canClose = false, canOpen = false),
            Copyright(0, "", "", ""),
            Likes(0, userLikes = false, canLike = false, canPublish = false),
            Reposts(0, false),
            Views(0),
            "",
            0,
            canPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            false,
            Donut(false, 0, false, ""),
            0
        )

        val result = service.update(update)
        assertTrue(result)
    }

    @Test
    fun updateResultFalse() {
        val service = WallService()
        service.add(
            Post(
                0,
                0,
                0,
                0,
                0,
                "",
                0,
                0,
                false,
                Comments(0, canPost = false, groupsCanPost = false, canClose = false, canOpen = false),
                Copyright(0, "", "", ""),
                Likes(0, userLikes = false, canLike = false, canPublish = false),
                Reposts(0, false),
                Views(0),
                "",
                0,
                canPin = false,
                canDelete = false,
                canEdit = false,
                isPinned = false,
                markedAsAds = false,
                false,
                Donut(false, 0, false, ""),
                0
            )
        )
        service.add(
            Post(
                0,
                0,
                0,
                0,
                0,
                "",
                0,
                0,
                false,
                Comments(0, canPost = false, groupsCanPost = false, canClose = false, canOpen = false),
                Copyright(0, "", "", ""),
                Likes(0, userLikes = false, canLike = false, canPublish = false),
                Reposts(0, false),
                Views(0),
                "",
                0,
                canPin = false,
                canDelete = false,
                canEdit = false,
                isPinned = false,
                markedAsAds = false,
                false,
                Donut(false, 0, false, ""),
                0
            )
        )
        service.add(
            Post(
                0,
                0,
                0,
                0,
                0,
                "",
                0,
                0,
                false,
                Comments(0, canPost = false, groupsCanPost = false, canClose = false, canOpen = false),
                Copyright(0, "", "", ""),
                Likes(0, userLikes = false, canLike = false, canPublish = false),
                Reposts(0, false),
                Views(0),
                "",
                0,
                canPin = false,
                canDelete = false,
                canEdit = false,
                isPinned = false,
                markedAsAds = false,
                false,
                Donut(false, 0, false, ""),
                0
            )
        )

        val update = Post(
            4,
            0,
            0,
            0,
            0,
            "",
            0,
            0,
            false,
            Comments(0, canPost = false, groupsCanPost = false, canClose = false, canOpen = false),
            Copyright(0, "", "", ""),
            Likes(0, userLikes = false, canLike = false, canPublish = false),
            Reposts(0, false),
            Views(0),
            "",
            0,
            canPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            false,
            Donut(false, 0, false, ""),
            0
        )

        val result = service.update(update)
        assertFalse(result)
    }
}
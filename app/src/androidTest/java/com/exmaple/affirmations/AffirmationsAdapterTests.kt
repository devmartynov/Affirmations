package com.exmaple.affirmations

import android.content.Context
import com.exmaple.affirmations.adapter.ItemAdapter
import com.exmaple.affirmations.model.Affirmation
import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.mock

class AffirmationsAdapterTests {
    private val context = mock(Context::class.java)

    @Test
    fun adapter_size() {
        val list = listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation1, R.drawable.image1)
        )

        val adapter = ItemAdapter(context, list);

        assertEquals("ItemAdapter is not the correct size", list.size, adapter.itemCount)
    }
}
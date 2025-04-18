package org.jetbrains.skiko

import org.jetbrains.skiko.redrawer.*

internal fun interface RenderFactory {
    fun createRedrawer(
        layer: SkiaLayer,
        renderApi: GraphicsApi,
        analytics: SkiaLayerAnalytics,
        properties: SkiaLayerProperties
    ): Redrawer

    companion object {
        val Default = makeDefaultRenderFactory()
    }
}

internal expect fun makeDefaultRenderFactory(): RenderFactory

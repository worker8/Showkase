// This is an auto-generated file. Please do not edit/modify this file.
package com.airbnb.android.showkase_processor_testing

import com.airbnb.android.showkase.`annotation`.ShowkaseRootCodegen
import com.airbnb.android.showkase.models.ShowkaseBrowserColor
import com.airbnb.android.showkase.models.ShowkaseBrowserComponent
import com.airbnb.android.showkase.models.ShowkaseBrowserTypography
import com.airbnb.android.showkase.models.ShowkaseProvider
import com.airbnb.android.showkase_browser_testing.comairbnbandroidshowkasebrowsertestingGroup1Composable1Usageofanintegerpreviewparameterprovider
import com.airbnb.android.showkase_browser_testing.comairbnbandroidshowkasebrowsertestingGroup1Composable2Usageofacharpreviewparameterprovider
import kotlin.collections.List

@ShowkaseRootCodegen(
  numComposablesWithoutPreviewParameter = 0,
  numComposablesWithPreviewParameter = 2,
  numColors = 0,
  numTypography = 0,
)
public class TestShowkaseRootCodegen : ShowkaseProvider {
  public override fun getShowkaseComponents(): List<ShowkaseBrowserComponent> {

    return mutableListOf<ShowkaseBrowserComponent>(
    ).apply {
        addAll(comairbnbandroidshowkasebrowsertestingGroup1Composable1Usageofanintegerpreviewparameterprovider)
        addAll(comairbnbandroidshowkasebrowsertestingGroup1Composable2Usageofacharpreviewparameterprovider)
    }
  }

  public override fun getShowkaseColors(): List<ShowkaseBrowserColor> {

    return listOf<ShowkaseBrowserColor>(
    )
  }

  public override fun getShowkaseTypography(): List<ShowkaseBrowserTypography> {

    return listOf<ShowkaseBrowserTypography>(
    )
  }
}

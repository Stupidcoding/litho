/*
 * Copyright 2014-present Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.facebook.litho;

import android.animation.StateListAnimator;
import android.graphics.drawable.Drawable;
import android.support.annotation.AttrRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.annotation.Px;
import android.support.annotation.StyleRes;
import android.util.SparseArray;
import android.view.ViewOutlineProvider;
import com.facebook.litho.reference.Reference;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaPositionType;

public interface CommonProps {
  @AttrRes
  int getDefStyleAttr();

  @StyleRes
  int getDefStyleRes();

  @Nullable
  YogaPositionType getPositionType();

  int getWidthPx();

  int getHeightPx();

  @Nullable
  Reference<? extends Drawable> getBackground();

  @Nullable
  String getTestKey();

  boolean isWrapInView();

  @Nullable
  YogaDirection getLayoutDirection();

  @Nullable
  YogaAlign getAlignSelf();

  float getFlex();

  float getFlexGrow();

  float getFlexShrink();

  @Px
  int getFlexBasisPx();

  float getFlexBasisPercent();

  int getImportantForAccessibility();

  boolean getDuplicateParentState();

  @Nullable
  Border getBorder();

  @Nullable
  StateListAnimator getStateListAnimator();

  @DrawableRes
  int getStateListAnimatorRes();

  float getAspectRatio();

  @Nullable
  Drawable getForeground();

  @Nullable
  EventHandler<ClickEvent> getClickHandler();

  @Nullable
  EventHandler<LongClickEvent> getLongClickHandler();

  @Nullable
  EventHandler<FocusChangedEvent> getFocusChangeHandler();

  @Nullable
  EventHandler<TouchEvent> getTouchHandler();

  @Nullable
  EventHandler<InterceptTouchEvent> getInterceptTouchHandler();

  boolean getFocusable();

  boolean getEnabled();

  boolean getSelected();

  float getVisibleHeightRatio();

  float getVisibleWidthRatio();

  @Nullable
  EventHandler<VisibleEvent> getVisibleHandler();

  @Nullable
  EventHandler<FocusedVisibleEvent> getFocusedHandler();

  @Nullable
  EventHandler<UnfocusedVisibleEvent> getUnfocusedHandler();

  @Nullable
  EventHandler<FullImpressionVisibleEvent> getFullImpressionHandler();

  @Nullable
  EventHandler<InvisibleEvent> getInvisibleHandler();

  @Nullable
  CharSequence getContentDescription();

  @Nullable
  Object getViewTag();

  @Nullable
  SparseArray getViewTags();

  float getShadowElevationPx();

  @Nullable
  ViewOutlineProvider getOutlineProvider();

  boolean getClipToOutline();

  @AccessibilityRole.AccessibilityRoleType
  @Nullable
  String getAccessibilityRole();

  @Nullable
  EventHandler<DispatchPopulateAccessibilityEventEvent>
      getDispatchPopulateAccessibilityEventHandler();

  @Nullable
  EventHandler<OnInitializeAccessibilityEventEvent> getOnInitializeAccessibilityEventHandler();

  @Nullable
  EventHandler<OnInitializeAccessibilityNodeInfoEvent>
      getOnInitializeAccessibilityNodeInfoHandler();

  @Nullable
  EventHandler<OnPopulateAccessibilityEventEvent> getOnPopulateAccessibilityEventHandler();

  @Nullable
  EventHandler<OnRequestSendAccessibilityEventEvent> getOnRequestSendAccessibilityEventHandler();

  @Nullable
  EventHandler<PerformAccessibilityActionEvent> getPerformAccessibilityActionHandler();

  @Nullable
  EventHandler<SendAccessibilityEventEvent> getSendAccessibilityEventHandler();

  @Nullable
  EventHandler<SendAccessibilityEventUncheckedEvent> getSendAccessibilityEventUncheckedHandler();

  float getScale();

  float getAlpha();

  float getRotation();

  @Nullable
  String getTransitionKey();
}

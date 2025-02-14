/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.facebook.fresco.ui.common

object NoOpImagePerfNotifier : ImagePerfNotifier {
  override fun notifyListenersOfVisibilityStateUpdate(
      state: ImagePerfState?,
      visibilityState: VisibilityState?
  ) = Unit

  override fun notifyStatusUpdated(state: ImagePerfState?, imageLoadStatus: ImageLoadStatus?) = Unit
}

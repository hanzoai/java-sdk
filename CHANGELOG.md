# Changelog

## 0.1.0-alpha.3 (2026-01-28)

Full Changelog: [v0.1.0-alpha.2...v0.1.0-alpha.3](https://github.com/hanzoai/java-sdk/compare/v0.1.0-alpha.2...v0.1.0-alpha.3)

### ⚠ BREAKING CHANGES

* **client:** extract auto pagination to shared classes
* **client:** **Migration:** - If you were referencing the `AutoPager` class on a specific `*Page` or `*PageAsync` type, then you should instead reference the shared `AutoPager` and `AutoPagerAsync` types, under the `core` package
    - `AutoPagerAsync` now has different usage. You can call `.subscribe(...)` on the returned object instead to get called back each page item. You can also call `onCompleteFuture()` to get a future that completes when all items have been processed. Finally, you can call `.close()` on the returned object to stop auto-paginating early
    - If you were referencing `getNextPage` or `getNextPageParams`:
       - Swap to `nextPage()` and `nextPageParams()`
       - Note that these both now return non-optional types (use `hasNextPage()` before calling these, since they will throw if it's impossible to get another page)

### Features

* **api:** api update ([93f7cd0](https://github.com/hanzoai/java-sdk/commit/93f7cd095fb6cdb1003bad2f3c3914bcbde48bf6))
* **api:** api update ([589ce7a](https://github.com/hanzoai/java-sdk/commit/589ce7af97f7b1fcea2519ae75f184ea7a6529ff))
* **api:** api update ([5997aeb](https://github.com/hanzoai/java-sdk/commit/5997aeb3a12a1dbb0e628c3ae2e2b73d6f5c0391))
* **api:** api update ([bb22539](https://github.com/hanzoai/java-sdk/commit/bb225395cd286571c72d6ad48582d0f5b54b9db9))
* **api:** api update ([#9](https://github.com/hanzoai/java-sdk/issues/9)) ([a0ab87a](https://github.com/hanzoai/java-sdk/commit/a0ab87ace8769fc2320a22cf1bd2d259ede567ae))
* **client:** add enum validation method ([ebf7b97](https://github.com/hanzoai/java-sdk/commit/ebf7b9734d07621d28d394281160823dea9c8de3))
* **client:** allow providing some params positionally ([4f35e18](https://github.com/hanzoai/java-sdk/commit/4f35e180123ecba96578a2eab86af922115cd005))
* **client:** expose request body setter and getter ([#16](https://github.com/hanzoai/java-sdk/issues/16)) ([69c2c6c](https://github.com/hanzoai/java-sdk/commit/69c2c6cd26d41cd1e0a5012398cd8ba54a7617ca))
* **client:** extract auto pagination to shared classes ([e735ee9](https://github.com/hanzoai/java-sdk/commit/e735ee9fb131714101989c4d8a724399932e8026))
* **client:** make datetime deserialization more lenient ([#15](https://github.com/hanzoai/java-sdk/issues/15)) ([d1cf89d](https://github.com/hanzoai/java-sdk/commit/d1cf89db05f61aa38c0a8d274ba3ee77d17e0341))
* **client:** make union deserialization more robust ([#14](https://github.com/hanzoai/java-sdk/issues/14)) ([ebf7b97](https://github.com/hanzoai/java-sdk/commit/ebf7b9734d07621d28d394281160823dea9c8de3))
* **client:** support setting base URL via env var ([7b40d13](https://github.com/hanzoai/java-sdk/commit/7b40d13ad642b0db4f872cf54cb0e75a8fb5fc1c))


### Bug Fixes

* **client:** add missing convenience methods ([afd652a](https://github.com/hanzoai/java-sdk/commit/afd652a14b550ae68fc192379c2649f3dea63601))
* **client:** bump to better jackson version ([21f5b79](https://github.com/hanzoai/java-sdk/commit/21f5b79e8a12fb75bb6ea91fc46173f4fed1fc8f))
* **client:** don't call `validate()` during deserialization if we don't have to ([#11](https://github.com/hanzoai/java-sdk/issues/11)) ([e5af84a](https://github.com/hanzoai/java-sdk/commit/e5af84a40d2f50556adcb9b54d088ff4482c81c7))
* **client:** limit json deserialization coercion ([#12](https://github.com/hanzoai/java-sdk/issues/12)) ([a476286](https://github.com/hanzoai/java-sdk/commit/a4762869b0ad34a0212ed4ea2fc00cce3a020487))
* **client:** return `Optional&lt;T&gt;` instead of `Optional<? extends T>` ([#19](https://github.com/hanzoai/java-sdk/issues/19)) ([becb670](https://github.com/hanzoai/java-sdk/commit/becb670d92fab9e105289da811f8b2ce3c63d776))
* pluralize `list` response variables ([#13](https://github.com/hanzoai/java-sdk/issues/13)) ([a7a0b4a](https://github.com/hanzoai/java-sdk/commit/a7a0b4a6b847da6df6b459af2c149c7569ad9e0c))


### Performance Improvements

* **client:** cached parsed type in `HttpResponseFor` ([#17](https://github.com/hanzoai/java-sdk/issues/17)) ([91c37b1](https://github.com/hanzoai/java-sdk/commit/91c37b152243864b852b3ab04c05ab0aadf28912))
* **internal:** improve compilation+test speed ([668e12a](https://github.com/hanzoai/java-sdk/commit/668e12a649f917543d6a44810cdce0f035993afe))


### Chores

* **ci:** add timeout thresholds for CI jobs ([2711202](https://github.com/hanzoai/java-sdk/commit/271120209107485ef828f66150c6b32c14db9d2f))
* **ci:** only use depot for staging repos ([76c8fa1](https://github.com/hanzoai/java-sdk/commit/76c8fa1b7cc7a685bbc0326773579dee3120a678))
* **client:** remove unnecessary json state from some query param classes ([ebf7b97](https://github.com/hanzoai/java-sdk/commit/ebf7b9734d07621d28d394281160823dea9c8de3))
* configure new SDK language ([4e8ff89](https://github.com/hanzoai/java-sdk/commit/4e8ff890138cf98a46038bf5ca5484820136929a))
* **docs:** grammar improvements ([ccd164e](https://github.com/hanzoai/java-sdk/commit/ccd164eaddd08e28deb6dc7934e27b75febee968))
* **internal:** add invalid json deserialization tests ([ebf7b97](https://github.com/hanzoai/java-sdk/commit/ebf7b9734d07621d28d394281160823dea9c8de3))
* **internal:** add json roundtripping tests ([ebf7b97](https://github.com/hanzoai/java-sdk/commit/ebf7b9734d07621d28d394281160823dea9c8de3))
* **internal:** codegen related update ([f5151f7](https://github.com/hanzoai/java-sdk/commit/f5151f714c25e8331f9da13e5f3cf0169d2c1bd5))
* **internal:** codegen related update ([0b6be6f](https://github.com/hanzoai/java-sdk/commit/0b6be6fc53010ddef052f0142400aa2599225a26))
* **internal:** expand CI branch coverage ([1eddeb1](https://github.com/hanzoai/java-sdk/commit/1eddeb17b64eb80f6db6969d181c8f48ec9a08a6))
* **internal:** java 17 -&gt; 21 on ci ([2bcbac5](https://github.com/hanzoai/java-sdk/commit/2bcbac55db86820f67047c1be46898513970bee8))
* **internal:** reduce CI branch coverage ([c8a88d7](https://github.com/hanzoai/java-sdk/commit/c8a88d7303cd41aada70dea065bb8a51522c3373))
* **internal:** remove flaky `-Xbackend-threads=0` option ([2548d25](https://github.com/hanzoai/java-sdk/commit/2548d2575aaab0c2dbcf87b9df3e9d04cd2f9f25))
* **internal:** swap from `getNullable` to `getOptional` ([#18](https://github.com/hanzoai/java-sdk/issues/18)) ([b4a0c8b](https://github.com/hanzoai/java-sdk/commit/b4a0c8b295e7216dd22f472b4ee4198664f7dad0))
* **internal:** update java toolchain ([5c62cf3](https://github.com/hanzoai/java-sdk/commit/5c62cf3a190d7fc3d2c0def9b589c7dceb0bb025))
* **internal:** use `byteInputStream()` in tests ([afd652a](https://github.com/hanzoai/java-sdk/commit/afd652a14b550ae68fc192379c2649f3dea63601))


### Documentation

* add comments to `JsonField` classes ([becb670](https://github.com/hanzoai/java-sdk/commit/becb670d92fab9e105289da811f8b2ce3c63d776))
* **client:** update jackson compat error message ([b2310d3](https://github.com/hanzoai/java-sdk/commit/b2310d32ce73c02a5942f04fbfc66d38c6c371d7))
* document how to forcibly omit required field ([4dc5520](https://github.com/hanzoai/java-sdk/commit/4dc5520842ee6f01676aa386177d8924430fc3fa))
* explain http client customization ([e43d638](https://github.com/hanzoai/java-sdk/commit/e43d6381ec86c1c7372e03fede163b2bd4fa673a))
* explain jackson compat in readme ([b62faed](https://github.com/hanzoai/java-sdk/commit/b62faed4882e4f2a39014a11fda5297c09269a07))
* swap examples used in readme ([#20](https://github.com/hanzoai/java-sdk/issues/20)) ([4dc5520](https://github.com/hanzoai/java-sdk/commit/4dc5520842ee6f01676aa386177d8924430fc3fa))
* update documentation links to be more uniform ([c878297](https://github.com/hanzoai/java-sdk/commit/c878297f959b3215eacb52b1579d4dc0eae1f79b))

## 0.1.0-alpha.2 (2025-03-27)

Full Changelog: [v0.1.0-alpha.1...v0.1.0-alpha.2](https://github.com/hanzoai/java-sdk/compare/v0.1.0-alpha.1...v0.1.0-alpha.2)

### Chores

* update SDK settings ([#6](https://github.com/hanzoai/java-sdk/issues/6)) ([db7f67a](https://github.com/hanzoai/java-sdk/commit/db7f67aaab4d79b434ee3f7e1e4c51dc37cfcd1c))

## 0.1.0-alpha.1 (2025-03-27)

Full Changelog: [v0.0.1-alpha.0...v0.1.0-alpha.1](https://github.com/hanzoai/java-sdk/compare/v0.0.1-alpha.0...v0.1.0-alpha.1)

### Features

* **api:** api update ([#4](https://github.com/hanzoai/java-sdk/issues/4)) ([44028d5](https://github.com/hanzoai/java-sdk/commit/44028d59e98a3f2e32172a5c219097f6f27da433))
* **api:** manual updates ([#3](https://github.com/hanzoai/java-sdk/issues/3)) ([1487697](https://github.com/hanzoai/java-sdk/commit/1487697b105d2b01a2db415cd740168a282bf30b))


### Chores

* configure new SDK language ([938d5c6](https://github.com/hanzoai/java-sdk/commit/938d5c60845573651f83ca7095d10ae03850091e))
* go live ([#1](https://github.com/hanzoai/java-sdk/issues/1)) ([a72d2b3](https://github.com/hanzoai/java-sdk/commit/a72d2b3ffa5042d2a5ee3002090a80a9ceac6ae3))

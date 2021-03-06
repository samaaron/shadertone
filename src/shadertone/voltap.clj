;; copied from:
;; https://github.com/samaaron/arnold/blob/master/src/arnold/voltap.clj
;; see usage in:
;; https://github.com/samaaron/arnold/blob/master/src/arnold/sphere.clj
(ns shadertone.voltap
  (:use [overtone.live]))

(defsynth vol []
  (tap "system-vol" 60 (lag (abs (in:ar 0)) 0.1)))

(defn retap []
  (def g (group))
  (def v (vol :target g)))

(retap)


baseCommand: [cat, foo.txt]
class: CommandLineTool
cwlVersion: v1.2
hints:
  DockerRequirement: {dockerPull: 'debian:stretch-slim'}
inputs:
- {id: file1, type: File}
outputs:
- id: foo
  outputBinding: {glob: foo.txt}
  type: File
requirements:
- class: InlineJavascriptRequirement
  expressionLib: ["//     Underscore.js 1.7.0\n//     http://underscorejs.org\n//
      \    (c) 2009-2014 Jeremy Ashkenas, DocumentCloud and Investigative Reporters
      & Editors\n//     Underscore may be freely distributed under the MIT license.\n\n(function()
      {\n\n  // Baseline setup\n  // --------------\n\n  // Establish the root object,
      `window` in the browser, or `exports` on the server.\n  var root = this;\n\n
      \ // Save the previous value of the `_` variable.\n  //var previousUnderscore
      = root._;\n\n  // Save bytes in the minified (but not gzipped) version:\n  var
      ArrayProto = Array.prototype, ObjProto = Object.prototype, FuncProto = Function.prototype;\n\n
      \ // Create quick reference variables for speed access to core prototypes.\n
      \ var\n    push             = ArrayProto.push,\n    slice            = ArrayProto.slice,\n
      \   concat           = ArrayProto.concat,\n    toString         = ObjProto.toString,\n
      \   hasOwnProperty   = ObjProto.hasOwnProperty;\n\n  // All **ECMAScript 5**
      native function implementations that we hope to use\n  // are declared here.\n
      \ var\n    nativeIsArray      = Array.isArray,\n    nativeKeys         = Object.keys,\n
      \   nativeBind         = FuncProto.bind;\n\n  // Create a safe reference to
      the Underscore object for use below.\n  var _ = function(obj) {\n    if (obj
      instanceof _) return obj;\n    if (!(this instanceof _)) return new _(obj);\n
      \   this._wrapped = obj;\n  };\n\n  // Export the Underscore object for **Node.js**,
      with\n  // backwards-compatibility for the old `require()` API. If we're in\n
      \ // the browser, add `_` as a global object.\n  if (typeof exports !== 'undefined')
      {\n    if (typeof module !== 'undefined' && module.exports) {\n      exports
      = module.exports = _;\n    }\n    exports._ = _;\n  } else {\n    root._ = _;\n
      \ }\n\n  // Current version.\n  _.VERSION = '1.7.0';\n\n  // Internal function
      that returns an efficient (for current engines) version\n  // of the passed-in
      callback, to be repeatedly applied in other Underscore\n  // functions.\n  var
      createCallback = function(func, context, argCount) {\n    if (context === void
      0) return func;\n    switch (argCount == null ? 3 : argCount) {\n      case
      1: return function(value) {\n        return func.call(context, value);\n      };\n
      \     case 2: return function(value, other) {\n        return func.call(context,
      value, other);\n      };\n      case 3: return function(value, index, collection)
      {\n        return func.call(context, value, index, collection);\n      };\n
      \     case 4: return function(accumulator, value, index, collection) {\n        return
      func.call(context, accumulator, value, index, collection);\n      };\n    }\n
      \   return function() {\n      return func.apply(context, arguments);\n    };\n
      \ };\n\n  // A mostly-internal function to generate callbacks that can be applied\n
      \ // to each element in a collection, returning the desired result — either\n
      \ // identity, an arbitrary callback, a property matcher, or a property accessor.\n
      \ _.iteratee = function(value, context, argCount) {\n    if (value == null)
      return _.identity;\n    if (_.isFunction(value)) return createCallback(value,
      context, argCount);\n    if (_.isObject(value)) return _.matches(value);\n    return
      _.property(value);\n  };\n\n  // Collection Functions\n  // --------------------\n\n
      \ // The cornerstone, an `each` implementation, aka `forEach`.\n  // Handles
      raw objects in addition to array-likes. Treats all\n  // sparse array-likes
      as if they were dense.\n  _.each = _.forEach = function(obj, iteratee, context)
      {\n    if (obj == null) return obj;\n    iteratee = createCallback(iteratee,
      context);\n    var i, length = obj.length;\n    if (length === +length) {\n
      \     for (i = 0; i < length; i++) {\n        iteratee(obj[i], i, obj);\n      }\n
      \   } else {\n      var keys = _.keys(obj);\n      for (i = 0, length = keys.length;
      i < length; i++) {\n        iteratee(obj[keys[i]], keys[i], obj);\n      }\n
      \   }\n    return obj;\n  };\n\n  // Return the results of applying the iteratee
      to each element.\n  _.map = _.collect = function(obj, iteratee, context) {\n
      \   if (obj == null) return [];\n    iteratee = _.iteratee(iteratee, context);\n
      \   var keys = obj.length !== +obj.length && _.keys(obj),\n        length =
      (keys || obj).length,\n        results = Array(length),\n        currentKey;\n
      \   for (var index = 0; index < length; index++) {\n      currentKey = keys
      ? keys[index] : index;\n      results[index] = iteratee(obj[currentKey], currentKey,
      obj);\n    }\n    return results;\n  };\n\n  var reduceError = 'Reduce of empty
      array with no initial value';\n\n  // **Reduce** builds up a single result from
      a list of values, aka `inject`,\n  // or `foldl`.\n  _.reduce = _.foldl = _.inject
      = function(obj, iteratee, memo, context) {\n    if (obj == null) obj = [];\n
      \   iteratee = createCallback(iteratee, context, 4);\n    var keys = obj.length
      !== +obj.length && _.keys(obj),\n        length = (keys || obj).length,\n        index
      = 0, currentKey;\n    if (arguments.length < 3) {\n      if (!length) throw
      new TypeError(reduceError);\n      memo = obj[keys ? keys[index++] : index++];\n
      \   }\n    for (; index < length; index++) {\n      currentKey = keys ? keys[index]
      : index;\n      memo = iteratee(memo, obj[currentKey], currentKey, obj);\n    }\n
      \   return memo;\n  };\n\n  // The right-associative version of reduce, also
      known as `foldr`.\n  _.reduceRight = _.foldr = function(obj, iteratee, memo,
      context) {\n    if (obj == null) obj = [];\n    iteratee = createCallback(iteratee,
      context, 4);\n    var keys = obj.length !== + obj.length && _.keys(obj),\n        index
      = (keys || obj).length,\n        currentKey;\n    if (arguments.length < 3)
      {\n      if (!index) throw new TypeError(reduceError);\n      memo = obj[keys
      ? keys[--index] : --index];\n    }\n    while (index--) {\n      currentKey
      = keys ? keys[index] : index;\n      memo = iteratee(memo, obj[currentKey],
      currentKey, obj);\n    }\n    return memo;\n  };\n\n  // Return the first value
      which passes a truth test. Aliased as `detect`.\n  _.find = _.detect = function(obj,
      predicate, context) {\n    var result;\n    predicate = _.iteratee(predicate,
      context);\n    _.some(obj, function(value, index, list) {\n      if (predicate(value,
      index, list)) {\n        result = value;\n        return true;\n      }\n    });\n
      \   return result;\n  };\n\n  // Return all the elements that pass a truth test.\n
      \ // Aliased as `select`.\n  _.filter = _.select = function(obj, predicate,
      context) {\n    var results = [];\n    if (obj == null) return results;\n    predicate
      = _.iteratee(predicate, context);\n    _.each(obj, function(value, index, list)
      {\n      if (predicate(value, index, list)) results.push(value);\n    });\n
      \   return results;\n  };\n\n  // Return all the elements for which a truth
      test fails.\n  _.reject = function(obj, predicate, context) {\n    return _.filter(obj,
      _.negate(_.iteratee(predicate)), context);\n  };\n\n  // Determine whether all
      of the elements match a truth test.\n  // Aliased as `all`.\n  _.every = _.all
      = function(obj, predicate, context) {\n    if (obj == null) return true;\n    predicate
      = _.iteratee(predicate, context);\n    var keys = obj.length !== +obj.length
      && _.keys(obj),\n        length = (keys || obj).length,\n        index, currentKey;\n
      \   for (index = 0; index < length; index++) {\n      currentKey = keys ? keys[index]
      : index;\n      if (!predicate(obj[currentKey], currentKey, obj)) return false;\n
      \   }\n    return true;\n  };\n\n  // Determine if at least one element in the
      object matches a truth test.\n  // Aliased as `any`.\n  _.some = _.any = function(obj,
      predicate, context) {\n    if (obj == null) return false;\n    predicate = _.iteratee(predicate,
      context);\n    var keys = obj.length !== +obj.length && _.keys(obj),\n        length
      = (keys || obj).length,\n        index, currentKey;\n    for (index = 0; index
      < length; index++) {\n      currentKey = keys ? keys[index] : index;\n      if
      (predicate(obj[currentKey], currentKey, obj)) return true;\n    }\n    return
      false;\n  };\n\n  // Determine if the array or object contains a given value
      (using `===`).\n  // Aliased as `include`.\n  _.contains = _.include = function(obj,
      target) {\n    if (obj == null) return false;\n    if (obj.length !== +obj.length)
      obj = _.values(obj);\n    return _.indexOf(obj, target) >= 0;\n  };\n\n  //
      Invoke a method (with arguments) on every item in a collection.\n  _.invoke
      = function(obj, method) {\n    var args = slice.call(arguments, 2);\n    var
      isFunc = _.isFunction(method);\n    return _.map(obj, function(value) {\n      return
      (isFunc ? method : value[method]).apply(value, args);\n    });\n  };\n\n  //
      Convenience version of a common use case of `map`: fetching a property.\n  _.pluck
      = function(obj, key) {\n    return _.map(obj, _.property(key));\n  };\n\n  //
      Convenience version of a common use case of `filter`: selecting only objects\n
      \ // containing specific `key:value` pairs.\n  _.where = function(obj, attrs)
      {\n    return _.filter(obj, _.matches(attrs));\n  };\n\n  // Convenience version
      of a common use case of `find`: getting the first object\n  // containing specific
      `key:value` pairs.\n  _.findWhere = function(obj, attrs) {\n    return _.find(obj,
      _.matches(attrs));\n  };\n\n  // Return the maximum element (or element-based
      computation).\n  _.max = function(obj, iteratee, context) {\n    var result
      = -Infinity, lastComputed = -Infinity,\n        value, computed;\n    if (iteratee
      == null && obj != null) {\n      obj = obj.length === +obj.length ? obj : _.values(obj);\n
      \     for (var i = 0, length = obj.length; i < length; i++) {\n        value
      = obj[i];\n        if (value > result) {\n          result = value;\n        }\n
      \     }\n    } else {\n      iteratee = _.iteratee(iteratee, context);\n      _.each(obj,
      function(value, index, list) {\n        computed = iteratee(value, index, list);\n
      \       if (computed > lastComputed || computed === -Infinity && result ===
      -Infinity) {\n          result = value;\n          lastComputed = computed;\n
      \       }\n      });\n    }\n    return result;\n  };\n\n  // Return the minimum
      element (or element-based computation).\n  _.min = function(obj, iteratee, context)
      {\n    var result = Infinity, lastComputed = Infinity,\n        value, computed;\n
      \   if (iteratee == null && obj != null) {\n      obj = obj.length === +obj.length
      ? obj : _.values(obj);\n      for (var i = 0, length = obj.length; i < length;
      i++) {\n        value = obj[i];\n        if (value < result) {\n          result
      = value;\n        }\n      }\n    } else {\n      iteratee = _.iteratee(iteratee,
      context);\n      _.each(obj, function(value, index, list) {\n        computed
      = iteratee(value, index, list);\n        if (computed < lastComputed || computed
      === Infinity && result === Infinity) {\n          result = value;\n          lastComputed
      = computed;\n        }\n      });\n    }\n    return result;\n  };\n\n  // Shuffle
      a collection, using the modern version of the\n  // [Fisher-Yates shuffle](http://en.wikipedia.org/wiki/Fisher–Yates_shuffle).\n
      \ _.shuffle = function(obj) {\n    var set = obj && obj.length === +obj.length
      ? obj : _.values(obj);\n    var length = set.length;\n    var shuffled = Array(length);\n
      \   for (var index = 0, rand; index < length; index++) {\n      rand = _.random(0,
      index);\n      if (rand !== index) shuffled[index] = shuffled[rand];\n      shuffled[rand]
      = set[index];\n    }\n    return shuffled;\n  };\n\n  // Sample **n** random
      values from a collection.\n  // If **n** is not specified, returns a single
      random element.\n  // The internal `guard` argument allows it to work with `map`.\n
      \ _.sample = function(obj, n, guard) {\n    if (n == null || guard) {\n      if
      (obj.length !== +obj.length) obj = _.values(obj);\n      return obj[_.random(obj.length
      - 1)];\n    }\n    return _.shuffle(obj).slice(0, Math.max(0, n));\n  };\n\n
      \ // Sort the object's values by a criterion produced by an iteratee.\n  _.sortBy
      = function(obj, iteratee, context) {\n    iteratee = _.iteratee(iteratee, context);\n
      \   return _.pluck(_.map(obj, function(value, index, list) {\n      return {\n
      \       value: value,\n        index: index,\n        criteria: iteratee(value,
      index, list)\n      };\n    }).sort(function(left, right) {\n      var a = left.criteria;\n
      \     var b = right.criteria;\n      if (a !== b) {\n        if (a > b || a
      === void 0) return 1;\n        if (a < b || b === void 0) return -1;\n      }\n
      \     return left.index - right.index;\n    }), 'value');\n  };\n\n  // An internal
      function used for aggregate \"group by\" operations.\n  var group = function(behavior)
      {\n    return function(obj, iteratee, context) {\n      var result = {};\n      iteratee
      = _.iteratee(iteratee, context);\n      _.each(obj, function(value, index) {\n
      \       var key = iteratee(value, index, obj);\n        behavior(result, value,
      key);\n      });\n      return result;\n    };\n  };\n\n  // Groups the object's
      values by a criterion. Pass either a string attribute\n  // to group by, or
      a function that returns the criterion.\n  _.groupBy = group(function(result,
      value, key) {\n    if (_.has(result, key)) result[key].push(value); else result[key]
      = [value];\n  });\n\n  // Indexes the object's values by a criterion, similar
      to `groupBy`, but for\n  // when you know that your index values will be unique.\n
      \ _.indexBy = group(function(result, value, key) {\n    result[key] = value;\n
      \ });\n\n  // Counts instances of an object that group by a certain criterion.
      Pass\n  // either a string attribute to count by, or a function that returns
      the\n  // criterion.\n  _.countBy = group(function(result, value, key) {\n    if
      (_.has(result, key)) result[key]++; else result[key] = 1;\n  });\n\n  // Use
      a comparator function to figure out the smallest index at which\n  // an object
      should be inserted so as to maintain order. Uses binary search.\n  _.sortedIndex
      = function(array, obj, iteratee, context) {\n    iteratee = _.iteratee(iteratee,
      context, 1);\n    var value = iteratee(obj);\n    var low = 0, high = array.length;\n
      \   while (low < high) {\n      var mid = low + high >>> 1;\n      if (iteratee(array[mid])
      < value) low = mid + 1; else high = mid;\n    }\n    return low;\n  };\n\n  //
      Safely create a real, live array from anything iterable.\n  _.toArray = function(obj)
      {\n    if (!obj) return [];\n    if (_.isArray(obj)) return slice.call(obj);\n
      \   if (obj.length === +obj.length) return _.map(obj, _.identity);\n    return
      _.values(obj);\n  };\n\n  // Return the number of elements in an object.\n  _.size
      = function(obj) {\n    if (obj == null) return 0;\n    return obj.length ===
      +obj.length ? obj.length : _.keys(obj).length;\n  };\n\n  // Split a collection
      into two arrays: one whose elements all satisfy the given\n  // predicate, and
      one whose elements all do not satisfy the predicate.\n  _.partition = function(obj,
      predicate, context) {\n    predicate = _.iteratee(predicate, context);\n    var
      pass = [], fail = [];\n    _.each(obj, function(value, key, obj) {\n      (predicate(value,
      key, obj) ? pass : fail).push(value);\n    });\n    return [pass, fail];\n  };\n\n
      \ // Array Functions\n  // ---------------\n\n  // Get the first element of
      an array. Passing **n** will return the first N\n  // values in the array. Aliased
      as `head` and `take`. The **guard** check\n  // allows it to work with `_.map`.\n
      \ _.first = _.head = _.take = function(array, n, guard) {\n    if (array ==
      null) return void 0;\n    if (n == null || guard) return array[0];\n    if (n
      < 0) return [];\n    return slice.call(array, 0, n);\n  };\n\n  // Returns everything
      but the last entry of the array. Especially useful on\n  // the arguments object.
      Passing **n** will return all the values in\n  // the array, excluding the last
      N. The **guard** check allows it to work with\n  // `_.map`.\n  _.initial =
      function(array, n, guard) {\n    return slice.call(array, 0, Math.max(0, array.length
      - (n == null || guard ? 1 : n)));\n  };\n\n  // Get the last element of an array.
      Passing **n** will return the last N\n  // values in the array. The **guard**
      check allows it to work with `_.map`.\n  _.last = function(array, n, guard)
      {\n    if (array == null) return void 0;\n    if (n == null || guard) return
      array[array.length - 1];\n    return slice.call(array, Math.max(array.length
      - n, 0));\n  };\n\n  // Returns everything but the first entry of the array.
      Aliased as `tail` and `drop`.\n  // Especially useful on the arguments object.
      Passing an **n** will return\n  // the rest N values in the array. The **guard**\n
      \ // check allows it to work with `_.map`.\n  _.rest = _.tail = _.drop = function(array,
      n, guard) {\n    return slice.call(array, n == null || guard ? 1 : n);\n  };\n\n
      \ // Trim out all falsy values from an array.\n  _.compact = function(array)
      {\n    return _.filter(array, _.identity);\n  };\n\n  // Internal implementation
      of a recursive `flatten` function.\n  var flatten = function(input, shallow,
      strict, output) {\n    if (shallow && _.every(input, _.isArray)) {\n      return
      concat.apply(output, input);\n    }\n    for (var i = 0, length = input.length;
      i < length; i++) {\n      var value = input[i];\n      if (!_.isArray(value)
      && !_.isArguments(value)) {\n        if (!strict) output.push(value);\n      }
      else if (shallow) {\n        push.apply(output, value);\n      } else {\n        flatten(value,
      shallow, strict, output);\n      }\n    }\n    return output;\n  };\n\n  //
      Flatten out an array, either recursively (by default), or just one level.\n
      \ _.flatten = function(array, shallow) {\n    return flatten(array, shallow,
      false, []);\n  };\n\n  // Return a version of the array that does not contain
      the specified value(s).\n  _.without = function(array) {\n    return _.difference(array,
      slice.call(arguments, 1));\n  };\n\n  // Produce a duplicate-free version of
      the array. If the array has already\n  // been sorted, you have the option of
      using a faster algorithm.\n  // Aliased as `unique`.\n  _.uniq = _.unique =
      function(array, isSorted, iteratee, context) {\n    if (array == null) return
      [];\n    if (!_.isBoolean(isSorted)) {\n      context = iteratee;\n      iteratee
      = isSorted;\n      isSorted = false;\n    }\n    if (iteratee != null) iteratee
      = _.iteratee(iteratee, context);\n    var result = [];\n    var seen = [];\n
      \   for (var i = 0, length = array.length; i < length; i++) {\n      var value
      = array[i];\n      if (isSorted) {\n        if (!i || seen !== value) result.push(value);\n
      \       seen = value;\n      } else if (iteratee) {\n        var computed =
      iteratee(value, i, array);\n        if (_.indexOf(seen, computed) < 0) {\n          seen.push(computed);\n
      \         result.push(value);\n        }\n      } else if (_.indexOf(result,
      value) < 0) {\n        result.push(value);\n      }\n    }\n    return result;\n
      \ };\n\n  // Produce an array that contains the union: each distinct element
      from all of\n  // the passed-in arrays.\n  _.union = function() {\n    return
      _.uniq(flatten(arguments, true, true, []));\n  };\n\n  // Produce an array that
      contains every item shared between all the\n  // passed-in arrays.\n  _.intersection
      = function(array) {\n    if (array == null) return [];\n    var result = [];\n
      \   var argsLength = arguments.length;\n    for (var i = 0, length = array.length;
      i < length; i++) {\n      var item = array[i];\n      if (_.contains(result,
      item)) continue;\n      for (var j = 1; j < argsLength; j++) {\n        if (!_.contains(arguments[j],
      item)) break;\n      }\n      if (j === argsLength) result.push(item);\n    }\n
      \   return result;\n  };\n\n  // Take the difference between one array and a
      number of other arrays.\n  // Only the elements present in just the first array
      will remain.\n  _.difference = function(array) {\n    var rest = flatten(slice.call(arguments,
      1), true, true, []);\n    return _.filter(array, function(value){\n      return
      !_.contains(rest, value);\n    });\n  };\n\n  // Zip together multiple lists
      into a single array -- elements that share\n  // an index go together.\n  _.zip
      = function(array) {\n    if (array == null) return [];\n    var length = _.max(arguments,
      'length').length;\n    var results = Array(length);\n    for (var i = 0; i <
      length; i++) {\n      results[i] = _.pluck(arguments, i);\n    }\n    return
      results;\n  };\n\n  // Converts lists into objects. Pass either a single array
      of `[key, value]`\n  // pairs, or two parallel arrays of the same length --
      one of keys, and one of\n  // the corresponding values.\n  _.object = function(list,
      values) {\n    if (list == null) return {};\n    var result = {};\n    for (var
      i = 0, length = list.length; i < length; i++) {\n      if (values) {\n        result[list[i]]
      = values[i];\n      } else {\n        result[list[i][0]] = list[i][1];\n      }\n
      \   }\n    return result;\n  };\n\n  // Return the position of the first occurrence
      of an item in an array,\n  // or -1 if the item is not included in the array.\n
      \ // If the array is large and already in sort order, pass `true`\n  // for
      **isSorted** to use binary search.\n  _.indexOf = function(array, item, isSorted)
      {\n    if (array == null) return -1;\n    var i = 0, length = array.length;\n
      \   if (isSorted) {\n      if (typeof isSorted == 'number') {\n        i = isSorted
      < 0 ? Math.max(0, length + isSorted) : isSorted;\n      } else {\n        i
      = _.sortedIndex(array, item);\n        return array[i] === item ? i : -1;\n
      \     }\n    }\n    for (; i < length; i++) if (array[i] === item) return i;\n
      \   return -1;\n  };\n\n  _.lastIndexOf = function(array, item, from) {\n    if
      (array == null) return -1;\n    var idx = array.length;\n    if (typeof from
      == 'number') {\n      idx = from < 0 ? idx + from + 1 : Math.min(idx, from +
      1);\n    }\n    while (--idx >= 0) if (array[idx] === item) return idx;\n    return
      -1;\n  };\n\n  // Generate an integer Array containing an arithmetic progression.
      A port of\n  // the native Python `range()` function. See\n  // [the Python
      documentation](http://docs.python.org/library/functions.html#range).\n  _.range
      = function(start, stop, step) {\n    if (arguments.length <= 1) {\n      stop
      = start || 0;\n      start = 0;\n    }\n    step = step || 1;\n\n    var length
      = Math.max(Math.ceil((stop - start) / step), 0);\n    var range = Array(length);\n\n
      \   for (var idx = 0; idx < length; idx++, start += step) {\n      range[idx]
      = start;\n    }\n\n    return range;\n  };\n\n  // Function (ahem) Functions\n
      \ // ------------------\n\n  // Reusable constructor function for prototype
      setting.\n  var Ctor = function(){};\n\n  // Create a function bound to a given
      object (assigning `this`, and arguments,\n  // optionally). Delegates to **ECMAScript
      5**'s native `Function.bind` if\n  // available.\n  _.bind = function(func,
      context) {\n    var args, bound;\n    if (nativeBind && func.bind === nativeBind)
      return nativeBind.apply(func, slice.call(arguments, 1));\n    if (!_.isFunction(func))
      throw new TypeError('Bind must be called on a function');\n    args = slice.call(arguments,
      2);\n    bound = function() {\n      if (!(this instanceof bound)) return func.apply(context,
      args.concat(slice.call(arguments)));\n      Ctor.prototype = func.prototype;\n
      \     var self = new Ctor;\n      Ctor.prototype = null;\n      var result =
      func.apply(self, args.concat(slice.call(arguments)));\n      if (_.isObject(result))
      return result;\n      return self;\n    };\n    return bound;\n  };\n\n  //
      Partially apply a function by creating a version that has had some of its\n
      \ // arguments pre-filled, without changing its dynamic `this` context. _ acts\n
      \ // as a placeholder, allowing any combination of arguments to be pre-filled.\n
      \ _.partial = function(func) {\n    var boundArgs = slice.call(arguments, 1);\n
      \   return function() {\n      var position = 0;\n      var args = boundArgs.slice();\n
      \     for (var i = 0, length = args.length; i < length; i++) {\n        if (args[i]
      === _) args[i] = arguments[position++];\n      }\n      while (position < arguments.length)
      args.push(arguments[position++]);\n      return func.apply(this, args);\n    };\n
      \ };\n\n  // Bind a number of an object's methods to that object. Remaining
      arguments\n  // are the method names to be bound. Useful for ensuring that all
      callbacks\n  // defined on an object belong to it.\n  _.bindAll = function(obj)
      {\n    var i, length = arguments.length, key;\n    if (length <= 1) throw new
      Error('bindAll must be passed function names');\n    for (i = 1; i < length;
      i++) {\n      key = arguments[i];\n      obj[key] = _.bind(obj[key], obj);\n
      \   }\n    return obj;\n  };\n\n  // Memoize an expensive function by storing
      its results.\n  _.memoize = function(func, hasher) {\n    var memoize = function(key)
      {\n      var cache = memoize.cache;\n      var address = hasher ? hasher.apply(this,
      arguments) : key;\n      if (!_.has(cache, address)) cache[address] = func.apply(this,
      arguments);\n      return cache[address];\n    };\n    memoize.cache = {};\n
      \   return memoize;\n  };\n\n  // Delays a function for the given number of
      milliseconds, and then calls\n  // it with the arguments supplied.\n  _.delay
      = function(func, wait) {\n    var args = slice.call(arguments, 2);\n    return
      setTimeout(function(){\n      return func.apply(null, args);\n    }, wait);\n
      \ };\n\n  // Defers a function, scheduling it to run after the current call
      stack has\n  // cleared.\n  _.defer = function(func) {\n    return _.delay.apply(_,
      [func, 1].concat(slice.call(arguments, 1)));\n  };\n\n  // Returns a function,
      that, when invoked, will only be triggered at most once\n  // during a given
      window of time. Normally, the throttled function will run\n  // as much as it
      can, without ever going more than once per `wait` duration;\n  // but if you'd
      like to disable the execution on the leading edge, pass\n  // `{leading: false}`.
      To disable execution on the trailing edge, ditto.\n  _.throttle = function(func,
      wait, options) {\n    var context, args, result;\n    var timeout = null;\n
      \   var previous = 0;\n    if (!options) options = {};\n    var later = function()
      {\n      previous = options.leading === false ? 0 : _.now();\n      timeout
      = null;\n      result = func.apply(context, args);\n      if (!timeout) context
      = args = null;\n    };\n    return function() {\n      var now = _.now();\n
      \     if (!previous && options.leading === false) previous = now;\n      var
      remaining = wait - (now - previous);\n      context = this;\n      args = arguments;\n
      \     if (remaining <= 0 || remaining > wait) {\n        clearTimeout(timeout);\n
      \       timeout = null;\n        previous = now;\n        result = func.apply(context,
      args);\n        if (!timeout) context = args = null;\n      } else if (!timeout
      && options.trailing !== false) {\n        timeout = setTimeout(later, remaining);\n
      \     }\n      return result;\n    };\n  };\n\n  // Returns a function, that,
      as long as it continues to be invoked, will not\n  // be triggered. The function
      will be called after it stops being called for\n  // N milliseconds. If `immediate`
      is passed, trigger the function on the\n  // leading edge, instead of the trailing.\n
      \ _.debounce = function(func, wait, immediate) {\n    var timeout, args, context,
      timestamp, result;\n\n    var later = function() {\n      var last = _.now()
      - timestamp;\n\n      if (last < wait && last > 0) {\n        timeout = setTimeout(later,
      wait - last);\n      } else {\n        timeout = null;\n        if (!immediate)
      {\n          result = func.apply(context, args);\n          if (!timeout) context
      = args = null;\n        }\n      }\n    };\n\n    return function() {\n      context
      = this;\n      args = arguments;\n      timestamp = _.now();\n      var callNow
      = immediate && !timeout;\n      if (!timeout) timeout = setTimeout(later, wait);\n
      \     if (callNow) {\n        result = func.apply(context, args);\n        context
      = args = null;\n      }\n\n      return result;\n    };\n  };\n\n  // Returns
      the first function passed as an argument to the second,\n  // allowing you to
      adjust arguments, run code before and after, and\n  // conditionally execute
      the original function.\n  _.wrap = function(func, wrapper) {\n    return _.partial(wrapper,
      func);\n  };\n\n  // Returns a negated version of the passed-in predicate.\n
      \ _.negate = function(predicate) {\n    return function() {\n      return !predicate.apply(this,
      arguments);\n    };\n  };\n\n  // Returns a function that is the composition
      of a list of functions, each\n  // consuming the return value of the function
      that follows.\n  _.compose = function() {\n    var args = arguments;\n    var
      start = args.length - 1;\n    return function() {\n      var i = start;\n      var
      result = args[start].apply(this, arguments);\n      while (i--) result = args[i].call(this,
      result);\n      return result;\n    };\n  };\n\n  // Returns a function that
      will only be executed after being called N times.\n  _.after = function(times,
      func) {\n    return function() {\n      if (--times < 1) {\n        return func.apply(this,
      arguments);\n      }\n    };\n  };\n\n  // Returns a function that will only
      be executed before being called N times.\n  _.before = function(times, func)
      {\n    var memo;\n    return function() {\n      if (--times > 0) {\n        memo
      = func.apply(this, arguments);\n      } else {\n        func = null;\n      }\n
      \     return memo;\n    };\n  };\n\n  // Returns a function that will be executed
      at most one time, no matter how\n  // often you call it. Useful for lazy initialization.\n
      \ _.once = _.partial(_.before, 2);\n\n  // Object Functions\n  // ----------------\n\n
      \ // Retrieve the names of an object's properties.\n  // Delegates to **ECMAScript
      5**'s native `Object.keys`\n  _.keys = function(obj) {\n    if (!_.isObject(obj))
      return [];\n    if (nativeKeys) return nativeKeys(obj);\n    var keys = [];\n
      \   for (var key in obj) if (_.has(obj, key)) keys.push(key);\n    return keys;\n
      \ };\n\n  // Retrieve the values of an object's properties.\n  _.values = function(obj)
      {\n    var keys = _.keys(obj);\n    var length = keys.length;\n    var values
      = Array(length);\n    for (var i = 0; i < length; i++) {\n      values[i] =
      obj[keys[i]];\n    }\n    return values;\n  };\n\n  // Convert an object into
      a list of `[key, value]` pairs.\n  _.pairs = function(obj) {\n    var keys =
      _.keys(obj);\n    var length = keys.length;\n    var pairs = Array(length);\n
      \   for (var i = 0; i < length; i++) {\n      pairs[i] = [keys[i], obj[keys[i]]];\n
      \   }\n    return pairs;\n  };\n\n  // Invert the keys and values of an object.
      The values must be serializable.\n  _.invert = function(obj) {\n    var result
      = {};\n    var keys = _.keys(obj);\n    for (var i = 0, length = keys.length;
      i < length; i++) {\n      result[obj[keys[i]]] = keys[i];\n    }\n    return
      result;\n  };\n\n  // Return a sorted list of the function names available on
      the object.\n  // Aliased as `methods`\n  _.functions = _.methods = function(obj)
      {\n    var names = [];\n    for (var key in obj) {\n      if (_.isFunction(obj[key]))
      names.push(key);\n    }\n    return names.sort();\n  };\n\n  // Extend a given
      object with all the properties in passed-in object(s).\n  _.extend = function(obj)
      {\n    if (!_.isObject(obj)) return obj;\n    var source, prop;\n    for (var
      i = 1, length = arguments.length; i < length; i++) {\n      source = arguments[i];\n
      \     for (prop in source) {\n        if (hasOwnProperty.call(source, prop))
      {\n            obj[prop] = source[prop];\n        }\n      }\n    }\n    return
      obj;\n  };\n\n  // Return a copy of the object only containing the whitelisted
      properties.\n  _.pick = function(obj, iteratee, context) {\n    var result =
      {}, key;\n    if (obj == null) return result;\n    if (_.isFunction(iteratee))
      {\n      iteratee = createCallback(iteratee, context);\n      for (key in obj)
      {\n        var value = obj[key];\n        if (iteratee(value, key, obj)) result[key]
      = value;\n      }\n    } else {\n      var keys = concat.apply([], slice.call(arguments,
      1));\n      obj = new Object(obj);\n      for (var i = 0, length = keys.length;
      i < length; i++) {\n        key = keys[i];\n        if (key in obj) result[key]
      = obj[key];\n      }\n    }\n    return result;\n  };\n\n   // Return a copy
      of the object without the blacklisted properties.\n  _.omit = function(obj,
      iteratee, context) {\n    if (_.isFunction(iteratee)) {\n      iteratee = _.negate(iteratee);\n
      \   } else {\n      var keys = _.map(concat.apply([], slice.call(arguments,
      1)), String);\n      iteratee = function(value, key) {\n        return !_.contains(keys,
      key);\n      };\n    }\n    return _.pick(obj, iteratee, context);\n  };\n\n
      \ // Fill in a given object with default properties.\n  _.defaults = function(obj)
      {\n    if (!_.isObject(obj)) return obj;\n    for (var i = 1, length = arguments.length;
      i < length; i++) {\n      var source = arguments[i];\n      for (var prop in
      source) {\n        if (obj[prop] === void 0) obj[prop] = source[prop];\n      }\n
      \   }\n    return obj;\n  };\n\n  // Create a (shallow-cloned) duplicate of
      an object.\n  _.clone = function(obj) {\n    if (!_.isObject(obj)) return obj;\n
      \   return _.isArray(obj) ? obj.slice() : _.extend({}, obj);\n  };\n\n  // Invokes
      interceptor with the obj, and then returns obj.\n  // The primary purpose of
      this method is to \"tap into\" a method chain, in\n  // order to perform operations
      on intermediate results within the chain.\n  _.tap = function(obj, interceptor)
      {\n    interceptor(obj);\n    return obj;\n  };\n\n  // Internal recursive comparison
      function for `isEqual`.\n  var eq = function(a, b, aStack, bStack) {\n    //
      Identical objects are equal. `0 === -0`, but they aren't identical.\n    //
      See the [Harmony `egal` proposal](http://wiki.ecmascript.org/doku.php?id=harmony:egal).\n
      \   if (a === b) return a !== 0 || 1 / a === 1 / b;\n    // A strict comparison
      is necessary because `null == undefined`.\n    if (a == null || b == null) return
      a === b;\n    // Unwrap any wrapped objects.\n    if (a instanceof _) a = a._wrapped;\n
      \   if (b instanceof _) b = b._wrapped;\n    // Compare `[[Class]]` names.\n
      \   var className = toString.call(a);\n    if (className !== toString.call(b))
      return false;\n    switch (className) {\n      // Strings, numbers, regular
      expressions, dates, and booleans are compared by value.\n      case '[object
      RegExp]':\n      // RegExps are coerced to strings for comparison (Note: ''
      + /a/i === '/a/i')\n      case '[object String]':\n        // Primitives and
      their corresponding object wrappers are equivalent; thus, `\"5\"` is\n        //
      equivalent to `new String(\"5\")`.\n        return '' + a === '' + b;\n      case
      '[object Number]':\n        // `NaN`s are equivalent, but non-reflexive.\n        //
      Object(NaN) is equivalent to NaN\n        if (+a !== +a) return +b !== +b;\n
      \       // An `egal` comparison is performed for other numeric values.\n        return
      +a === 0 ? 1 / +a === 1 / b : +a === +b;\n      case '[object Date]':\n      case
      '[object Boolean]':\n        // Coerce dates and booleans to numeric primitive
      values. Dates are compared by their\n        // millisecond representations.
      Note that invalid dates with millisecond representations\n        // of `NaN`
      are not equivalent.\n        return +a === +b;\n    }\n    if (typeof a != 'object'
      || typeof b != 'object') return false;\n    // Assume equality for cyclic structures.
      The algorithm for detecting cyclic\n    // structures is adapted from ES 5.1
      section 15.12.3, abstract operation `JO`.\n    var length = aStack.length;\n
      \   while (length--) {\n      // Linear search. Performance is inversely proportional
      to the number of\n      // unique nested structures.\n      if (aStack[length]
      === a) return bStack[length] === b;\n    }\n    // Objects with different constructors
      are not equivalent, but `Object`s\n    // from different frames are.\n    var
      aCtor = a.constructor, bCtor = b.constructor;\n    if (\n      aCtor !== bCtor
      &&\n      // Handle Object.create(x) cases\n      'constructor' in a && 'constructor'
      in b &&\n      !(_.isFunction(aCtor) && aCtor instanceof aCtor &&\n        _.isFunction(bCtor)
      && bCtor instanceof bCtor)\n    ) {\n      return false;\n    }\n    // Add
      the first object to the stack of traversed objects.\n    aStack.push(a);\n    bStack.push(b);\n
      \   var size, result;\n    // Recursively compare objects and arrays.\n    if
      (className === '[object Array]') {\n      // Compare array lengths to determine
      if a deep comparison is necessary.\n      size = a.length;\n      result = size
      === b.length;\n      if (result) {\n        // Deep compare the contents, ignoring
      non-numeric properties.\n        while (size--) {\n          if (!(result =
      eq(a[size], b[size], aStack, bStack))) break;\n        }\n      }\n    } else
      {\n      // Deep compare objects.\n      var keys = _.keys(a), key;\n      size
      = keys.length;\n      // Ensure that both objects contain the same number of
      properties before comparing deep equality.\n      result = _.keys(b).length
      === size;\n      if (result) {\n        while (size--) {\n          // Deep
      compare each member\n          key = keys[size];\n          if (!(result = _.has(b,
      key) && eq(a[key], b[key], aStack, bStack))) break;\n        }\n      }\n    }\n
      \   // Remove the first object from the stack of traversed objects.\n    aStack.pop();\n
      \   bStack.pop();\n    return result;\n  };\n\n  // Perform a deep comparison
      to check if two objects are equal.\n  _.isEqual = function(a, b) {\n    return
      eq(a, b, [], []);\n  };\n\n  // Is a given array, string, or object empty?\n
      \ // An \"empty\" object has no enumerable own-properties.\n  _.isEmpty = function(obj)
      {\n    if (obj == null) return true;\n    if (_.isArray(obj) || _.isString(obj)
      || _.isArguments(obj)) return obj.length === 0;\n    for (var key in obj) if
      (_.has(obj, key)) return false;\n    return true;\n  };\n\n  // Is a given value
      a DOM element?\n  _.isElement = function(obj) {\n    return !!(obj && obj.nodeType
      === 1);\n  };\n\n  // Is a given value an array?\n  // Delegates to ECMA5's
      native Array.isArray\n  _.isArray = nativeIsArray || function(obj) {\n    return
      toString.call(obj) === '[object Array]';\n  };\n\n  // Is a given variable an
      object?\n  _.isObject = function(obj) {\n    var type = typeof obj;\n    return
      type === 'function' || type === 'object' && !!obj;\n  };\n\n  // Add some isType
      methods: isArguments, isFunction, isString, isNumber, isDate, isRegExp.\n  _.each(['Arguments',
      'Function', 'String', 'Number', 'Date', 'RegExp'], function(name) {\n    _['is'
      + name] = function(obj) {\n      return toString.call(obj) === '[object ' +
      name + ']';\n    };\n  });\n\n  // Define a fallback version of the method in
      browsers (ahem, IE), where\n  // there isn't any inspectable \"Arguments\" type.\n
      \ if (!_.isArguments(arguments)) {\n    _.isArguments = function(obj) {\n      return
      _.has(obj, 'callee');\n    };\n  }\n\n  // Optimize `isFunction` if appropriate.
      Work around an IE 11 bug.\n  if (typeof /./ !== 'function') {\n    _.isFunction
      = function(obj) {\n      return typeof obj == 'function' || false;\n    };\n
      \ }\n\n  // Is a given object a finite number?\n  _.isFinite = function(obj)
      {\n    return isFinite(obj) && !isNaN(parseFloat(obj));\n  };\n\n  // Is the
      given value `NaN`? (NaN is the only number which does not equal itself).\n  _.isNaN
      = function(obj) {\n    return _.isNumber(obj) && obj !== +obj;\n  };\n\n  //
      Is a given value a boolean?\n  _.isBoolean = function(obj) {\n    return obj
      === true || obj === false || toString.call(obj) === '[object Boolean]';\n  };\n\n
      \ // Is a given value equal to null?\n  _.isNull = function(obj) {\n    return
      obj === null;\n  };\n\n  // Is a given variable undefined?\n  _.isUndefined
      = function(obj) {\n    return obj === void 0;\n  };\n\n  // Shortcut function
      for checking if an object has a given property directly\n  // on itself (in
      other words, not on a prototype).\n  _.has = function(obj, key) {\n    return
      obj != null && hasOwnProperty.call(obj, key);\n  };\n\n  // Utility Functions\n
      \ // -----------------\n\n  // Run Underscore.js in *noConflict* mode, returning
      the `_` variable to its\n  // previous owner. Returns a reference to the Underscore
      object.\n  _.noConflict = function() {\n    root._ = previousUnderscore;\n    return
      this;\n  };\n\n  // Keep the identity function around for default iteratees.\n
      \ _.identity = function(value) {\n    return value;\n  };\n\n  // Predicate-generating
      functions. Often useful outside of Underscore.\n  _.constant = function(value)
      {\n    return function() {\n      return value;\n    };\n  };\n\n  _.noop =
      function(){};\n\n  _.property = function(key) {\n    return function(obj) {\n
      \     return obj[key];\n    };\n  };\n\n  // Returns a predicate for checking
      whether an object has a given set of `key:value` pairs.\n  _.matches = function(attrs)
      {\n    var pairs = _.pairs(attrs), length = pairs.length;\n    return function(obj)
      {\n      if (obj == null) return !length;\n      obj = new Object(obj);\n      for
      (var i = 0; i < length; i++) {\n        var pair = pairs[i], key = pair[0];\n
      \       if (pair[1] !== obj[key] || !(key in obj)) return false;\n      }\n
      \     return true;\n    };\n  };\n\n  // Run a function **n** times.\n  _.times
      = function(n, iteratee, context) {\n    var accum = Array(Math.max(0, n));\n
      \   iteratee = createCallback(iteratee, context, 1);\n    for (var i = 0; i
      < n; i++) accum[i] = iteratee(i);\n    return accum;\n  };\n\n  // Return a
      random integer between min and max (inclusive).\n  _.random = function(min,
      max) {\n    if (max == null) {\n      max = min;\n      min = 0;\n    }\n    return
      min + Math.floor(Math.random() * (max - min + 1));\n  };\n\n  // A (possibly
      faster) way to get the current timestamp as an integer.\n  _.now = Date.now
      || function() {\n    return new Date().getTime();\n  };\n\n   // List of HTML
      entities for escaping.\n  var escapeMap = {\n    '&': '&amp;',\n    '<': '&lt;',\n
      \   '>': '&gt;',\n    '\"': '&quot;',\n    \"'\": '&#x27;',\n    '`': '&#x60;'\n
      \ };\n  var unescapeMap = _.invert(escapeMap);\n\n  // Functions for escaping
      and unescaping strings to/from HTML interpolation.\n  var createEscaper = function(map)
      {\n    var escaper = function(match) {\n      return map[match];\n    };\n    //
      Regexes for identifying a key that needs to be escaped\n    var source = '(?:'
      + _.keys(map).join('|') + ')';\n    var testRegexp = RegExp(source);\n    var
      replaceRegexp = RegExp(source, 'g');\n    return function(string) {\n      string
      = string == null ? '' : '' + string;\n      return testRegexp.test(string) ?
      string.replace(replaceRegexp, escaper) : string;\n    };\n  };\n  _.escape =
      createEscaper(escapeMap);\n  _.unescape = createEscaper(unescapeMap);\n\n  //
      If the value of the named `property` is a function then invoke it with the\n
      \ // `object` as context; otherwise, return it.\n  _.result = function(object,
      property) {\n    if (object == null) return void 0;\n    var value = object[property];\n
      \   return _.isFunction(value) ? object[property]() : value;\n  };\n\n  // Generate
      a unique integer id (unique within the entire client session).\n  // Useful
      for temporary DOM ids.\n  var idCounter = 0;\n  _.uniqueId = function(prefix)
      {\n    var id = ++idCounter + '';\n    return prefix ? prefix + id : id;\n  };\n\n
      \ // By default, Underscore uses ERB-style template delimiters, change the\n
      \ // following template settings to use alternative delimiters.\n  _.templateSettings
      = {\n    evaluate    : /<%([\\s\\S]+?)%>/g,\n    interpolate : /<%=([\\s\\S]+?)%>/g,\n
      \   escape      : /<%-([\\s\\S]+?)%>/g\n  };\n\n  // When customizing `templateSettings`,
      if you don't want to define an\n  // interpolation, evaluation or escaping regex,
      we need one that is\n  // guaranteed not to match.\n  var noMatch = /(.)^/;\n\n
      \ // Certain characters need to be escaped so that they can be put into a\n
      \ // string literal.\n  var escapes = {\n    \"'\":      \"'\",\n    '\\\\':
      \    '\\\\',\n    '\\r':     'r',\n    '\\n':     'n',\n    '\\u2028': 'u2028',\n
      \   '\\u2029': 'u2029'\n  };\n\n  var escaper = /\\\\|'|\\r|\\n|\\u2028|\\u2029/g;\n\n
      \ var escapeChar = function(match) {\n    return '\\\\' + escapes[match];\n
      \ };\n\n  // JavaScript micro-templating, similar to John Resig's implementation.\n
      \ // Underscore templating handles arbitrary delimiters, preserves whitespace,\n
      \ // and correctly escapes quotes within interpolated code.\n  // NB: `oldSettings`
      only exists for backwards compatibility.\n  _.template = function(text, settings,
      oldSettings) {\n    if (!settings && oldSettings) settings = oldSettings;\n
      \   settings = _.defaults({}, settings, _.templateSettings);\n\n    // Combine
      delimiters into one regular expression via alternation.\n    var matcher = RegExp([\n
      \     (settings.escape || noMatch).source,\n      (settings.interpolate || noMatch).source,\n
      \     (settings.evaluate || noMatch).source\n    ].join('|') + '|$', 'g');\n\n
      \   // Compile the template source, escaping string literals appropriately.\n
      \   var index = 0;\n    var source = \"__p+='\";\n    text.replace(matcher,
      function(match, escape, interpolate, evaluate, offset) {\n      source += text.slice(index,
      offset).replace(escaper, escapeChar);\n      index = offset + match.length;\n\n
      \     if (escape) {\n        source += \"'+\\n((__t=(\" + escape + \"))==null?'':_.escape(__t))+\\n'\";\n
      \     } else if (interpolate) {\n        source += \"'+\\n((__t=(\" + interpolate
      + \"))==null?'':__t)+\\n'\";\n      } else if (evaluate) {\n        source +=
      \"';\\n\" + evaluate + \"\\n__p+='\";\n      }\n\n      // Adobe VMs need the
      match returned to produce the correct offest.\n      return match;\n    });\n
      \   source += \"';\\n\";\n\n    // If a variable is not specified, place data
      values in local scope.\n    if (!settings.variable) source = 'with(obj||{}){\\n'
      + source + '}\\n';\n\n    source = \"var __t,__p='',__j=Array.prototype.join,\"
      +\n      \"print=function(){__p+=__j.call(arguments,'');};\\n\" +\n      source
      + 'return __p;\\n';\n\n    try {\n      var render = new Function(settings.variable
      || 'obj', '_', source);\n    } catch (e) {\n      e.source = source;\n      throw
      e;\n    }\n\n    var template = function(data) {\n      return render.call(this,
      data, _);\n    };\n\n    // Provide the compiled source as a convenience for
      precompilation.\n    var argument = settings.variable || 'obj';\n    template.source
      = 'function(' + argument + '){\\n' + source + '}';\n\n    return template;\n
      \ };\n\n  // Add a \"chain\" function. Start chaining a wrapped Underscore object.\n
      \ _.chain = function(obj) {\n    var instance = _(obj);\n    instance._chain
      = true;\n    return instance;\n  };\n\n  // OOP\n  // ---------------\n  //
      If Underscore is called as a function, it returns a wrapped object that\n  //
      can be used OO-style. This wrapper holds altered versions of all the\n  // underscore
      functions. Wrapped objects may be chained.\n\n  // Helper function to continue
      chaining intermediate results.\n  var result = function(obj) {\n    return this._chain
      ? _(obj).chain() : obj;\n  };\n\n  // Add your own custom functions to the Underscore
      object.\n  _.mixin = function(obj) {\n    _.each(_.functions(obj), function(name)
      {\n      var func = _[name] = obj[name];\n      _.prototype[name] = function()
      {\n        var args = [this._wrapped];\n        push.apply(args, arguments);\n
      \       return result.call(this, func.apply(_, args));\n      };\n    });\n
      \ };\n\n  // Add all of the Underscore functions to the wrapper object.\n  _.mixin(_);\n\n
      \ // Add all mutator Array functions to the wrapper.\n  _.each(['pop', 'push',
      'reverse', 'shift', 'sort', 'splice', 'unshift'], function(name) {\n    var
      method = ArrayProto[name];\n    _.prototype[name] = function() {\n      var
      obj = this._wrapped;\n      method.apply(obj, arguments);\n      if ((name ===
      'shift' || name === 'splice') && obj.length === 0) delete obj[0];\n      return
      result.call(this, obj);\n    };\n  });\n\n  // Add all accessor Array functions
      to the wrapper.\n  _.each(['concat', 'join', 'slice'], function(name) {\n    var
      method = ArrayProto[name];\n    _.prototype[name] = function() {\n      return
      result.call(this, method.apply(this._wrapped, arguments));\n    };\n  });\n\n
      \ // Extracts the result from a wrapped and chained object.\n  _.prototype.value
      = function() {\n    return this._wrapped;\n  };\n\n  // AMD registration happens
      at the end for compatibility with AMD loaders\n  // that may not enforce next-turn
      semantics on modules. Even though general\n  // practice for AMD registration
      is to be anonymous, underscore registers\n  // as a named module because, like
      jQuery, it is a base library that is\n  // popular enough to be bundled in a
      third party lib, but not be part of\n  // an AMD load request. Those cases could
      generate an error when an\n  // anonymous define() is called outside of a loader
      request.\n  if (typeof define === 'function' && define.amd) {\n    define('underscore',
      [], function() {\n      return _;\n    });\n  }\n}.call(this));\n", 'var t =
      function(s) { return _.template(s, {variable: ''data''})({''inputs'': inputs});
      };']
- class: InitialWorkDirRequirement
  listing:
  - {entry: '$(t("The file is <%= data.inputs.file1.path.split(''/'').slice(-1)[0]
      %>\n"))', entryname: foo.txt}

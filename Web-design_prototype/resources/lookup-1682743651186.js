(function(window, undefined) {
  var dictionary = {
    "5143d474-ecfc-4afc-b5bf-e614e7c1f83d": "Vision",
    "df9fed33-478e-4682-8ccf-dad0d2544ed7": "history",
    "ae59f389-2771-490d-83c3-196d2f0f3735": "prayer request",
    "92adede6-2930-49e4-95af-b15f2c07000c": "children's ministry",
    "682cc6d2-6514-4660-bc43-ba4ff9434bb1": "mission",
    "ab0afe04-28ab-4d04-9171-db578796197e": "Ministers",
    "83e84f2e-f071-427a-8549-67c4ff94683c": "ministries",
    "f63a6d84-43ce-43c7-9a28-5a49c1f4d19f": "helpline",
    "b6ec9934-8540-4516-9227-905734c6cf18": "teen and teenager",
    "8aead55f-d31e-4f0e-91d5-70b03610e837": "Online Giving",
    "a2576732-47b1-4da9-8014-0961f804a17f": "open heaven",
    "aa268dd6-2c9d-413c-b408-33b660e890f1": "media",
    "cdba0f04-a6da-4cc5-84a3-f7afa053fdde": "Events",
    "ee25efe3-8438-4b69-bd18-e9439253e576": "our pastor",
    "5f48cdf8-372f-4a36-9007-1c8388913213": "pilgrimage",
    "0d83c882-7aca-4310-b2d2-21d773c06d7b": "yaya",
    "d12245cc-1680-458d-89dd-4f0d7fb22724": "Home",
    "f39803f7-df02-4169-93eb-7547fb8c961a": "Template 1",
    "bb8abf58-f55e-472d-af05-a7d1bb0cc014": "default"
  };

  var uriRE = /^(\/#)?(screens|templates|masters|scenarios)\/(.*)(\.html)?/;
  window.lookUpURL = function(fragment) {
    var matches = uriRE.exec(fragment || "") || [],
        folder = matches[2] || "",
        canvas = matches[3] || "",
        name, url;
    if(dictionary.hasOwnProperty(canvas)) { /* search by name */
      url = folder + "/" + canvas;
    }
    return url;
  };

  window.lookUpName = function(fragment) {
    var matches = uriRE.exec(fragment || "") || [],
        folder = matches[2] || "",
        canvas = matches[3] || "",
        name, canvasName;
    if(dictionary.hasOwnProperty(canvas)) { /* search by name */
      canvasName = dictionary[canvas];
    }
    return canvasName;
  };
})(window);
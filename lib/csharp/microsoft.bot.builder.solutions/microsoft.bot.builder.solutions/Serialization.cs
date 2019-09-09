﻿using System.Collections.Generic;
using Microsoft.Rest.Serialization;
using Newtonsoft.Json;

namespace Microsoft.Bot.Builder.Solutions
{
    public class Serialization
    {
        public static JsonSerializerSettings Settings { get; } = new JsonSerializerSettings
        {
            Formatting = Formatting.Indented,
            DateFormatHandling = DateFormatHandling.IsoDateFormat,
            DateTimeZoneHandling = DateTimeZoneHandling.Utc,
            NullValueHandling = NullValueHandling.Ignore,
            ReferenceLoopHandling = ReferenceLoopHandling.Serialize,
            Converters = new List<JsonConverter>
            {
                new Iso8601TimeSpanConverter(),
            },
        };
    }
}

﻿// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

using System;
using System.Collections.Generic;
using System.Collections.Specialized;
using System.Threading.Tasks;
using Microsoft.Bot.Schema;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using SkillBot.Responses.Main;
using SkillBot.Responses.Shared;
using SkillBot.Tests.Utterances;

namespace SkillBot.Tests
{
    [TestClass]
    public class MainDialogTests : SkillTestBase
    {
        [TestMethod]
        public async Task Test_Intro_Message()
        {
            await GetTestFlow()
                .Send(new Activity()
                {
                    Type = ActivityTypes.ConversationUpdate,
                    MembersAdded = new List<ChannelAccount>() { new ChannelAccount("bot") },
                })
                .AssertReply(WelcomeMessage())
                .StartTestAsync();
        }

        [TestMethod]
        public async Task Test_Help_Intent()
        {
            await GetTestFlow()
                .Send(GeneralUtterances.Help)
                .AssertReply(HelpMessage())
                .StartTestAsync();
        }

        [TestMethod]
        public async Task Test_Unhandled_Message()
        {
            await GetTestFlow()
                .Send(GeneralUtterances.None)
                .AssertReply(DidntUnderstandMessage())
                .StartTestAsync();
        }

        private Action<IActivity> WelcomeMessage()
        {
            return activity =>
            {
                var messageActivity = activity.AsMessageActivity();
                CollectionAssert.Contains(ParseReplies(MainResponses.WelcomeMessage, new StringDictionary()), messageActivity.Text);
            };
        }

        private Action<IActivity> HelpMessage()
        {
            return activity =>
            {
                var messageActivity = activity.AsMessageActivity();
                CollectionAssert.Contains(ParseReplies(MainResponses.HelpMessage, new StringDictionary()), messageActivity.Text);
            };
        }

        private Action<IActivity> DidntUnderstandMessage()
        {
            return activity =>
            {
                var messageActivity = activity.AsMessageActivity();
                CollectionAssert.Contains(ParseReplies(SharedResponses.DidntUnderstandMessage, new StringDictionary()), messageActivity.Text);
            };
        }
    }
}